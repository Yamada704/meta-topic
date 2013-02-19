DESCRIPTION = "HDMI framebuffer module loader to load in correct order"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PV = "1"
PR = "r0"

PACKAGES = "${PN}"

S="${WORKDIR}"

SRC_URI = "file://modules.conf"

do_compile() {
}

do_install() {
	install -d ${D}/etc
	install -d ${D}/etc/modules-load.d
	install -m 644 ${S}/modules.conf ${D}/etc/modules-load.d/adi-hdmi.conf
}

