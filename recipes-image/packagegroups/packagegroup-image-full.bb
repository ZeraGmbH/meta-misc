SUMMARY = "All packages required for a full image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

MACHINE_SPECIFICS_FULL = ""
MACHINE_SPECIFICS_FULL_mx6 = "gstreamer1.0-plugins-imx"

RDEPENDS_${PN} = " \
    abiword-meta \
    gimp \
    fontforge \
    \
    antimony \
    \
    mpd \
    parole \
    ${MACHINE_SPECIFICS_FULL} \
    \
    midori \
    firefox \
"

#    chromium
#    menulibre
#    gursormaker
#    cherokee
#    gateone
