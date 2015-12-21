#!/bin/sh
mkdir -p src/{main,test}/{java,resources,scala}
mkdir lib project target

# create an initial build.sbt file
echo 'name := "spark_ensamble_local_outlier_factor"

version := "1.0"

scalaVersion := "2.10.4"' > build.sbt