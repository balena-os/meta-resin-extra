SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = " \
    git://github.com/gnab/rtl8812au;protocol=https \
    file://COPYING \
    file://0001-Use-modules_install-as-wanted-by-yocto.patch"
SRCREV = "38b565af37a8dfe535991cdc6afb94723c229f00"
S = "${WORKDIR}/git"

# Configuration for Raspberry Pi
SRC_URI_append_rpi = " file://0001-Compile-for-rpi-platform.patch"

export KSRC = "${STAGING_KERNEL_DIR}"
