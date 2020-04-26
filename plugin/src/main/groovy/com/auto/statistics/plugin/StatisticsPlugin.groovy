package com.auto.statistics.plugin

import com.android.build.gradle.AppExtension
import com.auto.statistics.utils.Logger
import org.gradle.api.Plugin
import org.gradle.api.Project

class StatisticsPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        Logger.error("------------apply StatisticsPlugin--------------")

        Object extension = project.extensions.create(
                "AutoStatisticsConfig",
                StatisticsExtension)

        boolean disablePlugin = false
        Properties properties = new Properties()
        if (project.rootProject.file('gradle.properties').exists()) {
            properties.load(project.rootProject.file('gradle.properties').newDataInputStream())
            disablePlugin = Boolean.parseBoolean(properties.getProperty("disableStatisticsPlugin", "false"))
        }

        if (!disablePlugin) {
            AppExtension android = project.extensions.getByType(AppExtension.class)
            StatisticsTransform transform = new StatisticsTransform(new StatisticsTransformHelper(extension))
            android.registerTransform(transform)

            project.afterEvaluate {
                Logger.setDebug(extension.debug)
            }
        } else {
            Logger.error("------------你已开启自动埋点插件--------------")
        }
    }
}