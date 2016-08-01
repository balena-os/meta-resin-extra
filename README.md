# Resin.io extra layer for all supported boards

## Description
This repository enables building extra/optional packages on top of meta-resin

## Layer dependencies

This layer depends on:

* URI: git://git.yoctoproject.org/poky
* URI: git://github.com/openembedded/meta-openembedded
    * layers: meta-oe, meta-networking, meta-python
* URI: git://git.yoctoproject.org/poky
* URI: https://github.com/resin-os/meta-resin.git
    * layers: meta-resin-common, meta-resin-<yocto-version>
