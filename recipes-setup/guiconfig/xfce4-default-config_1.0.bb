DESCRIPTION = "This recipe presets xfce user default configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r4"

inherit allarch

SRC_URI = " \
    file://.config \
    file://sonnenuntergang_08.jpg \
"

do_install() {
    # default user configration -> /etc/skel
    install -d ${D}${sysconfdir}/skel
    cp -r ${WORKDIR}/.config ${D}${sysconfdir}/skel/

    # background
    install -d ${D}${datadir}/backgrounds
    install -m 0644 ${WORKDIR}/sonnenuntergang_08.jpg ${D}${datadir}/backgrounds/ 
}

FILES_${PN} += "${datadir}/backgrounds ${datadir}/themes"
