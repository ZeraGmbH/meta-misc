DESCRIPTION = "This recipe presets xfce user default configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r1"

inherit allarch

SRC_URI = "file://.config \
           file://sonnenuntergang_08.jpg \
           file://gtkrc"

do_install() {
	install -d ${D}${sysconfdir}/skel/Desktop
	cp -rp ${WORKDIR}/.config ${D}${sysconfdir}/skel/

	install -d ${D}${sysconfdir}/gtk-2.0
	install -m 0644 ${WORKDIR}/gtkrc ${D}${sysconfdir}/gtk-2.0

	install -d ${D}${datadir}/backgrounds
	install -m 0644 ${WORKDIR}/sonnenuntergang_08.jpg ${D}${datadir}/backgrounds/ 
}

FILES_${PN} += "${datadir}/backgrounds"
