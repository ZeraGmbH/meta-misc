SUMMARY = "All packages required for a music image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    alsa-utils sf-tools \
    pulseaudio-module-alsa-card \
    qmmp \
    drumstick \
    timidity++ \
    fluidsynth-bin fluidsynth-dssi soundfont-collection-meta \
    xsynth-dssi \
    jack-utils patchage gmidimonitor \
    sox \
    qsynth qjackctl qjackctl-defconfig qmidinet qmidictl \
    a2jmidid midifilter.lv2 \
    ardour5 muse rosegarden qtractor qtractor-defconfig lmms \
    synthv1 synthv1-presets drumkv1 drumkv1-presets samplv1 padthv1 padthv1-presets \
    amsynth helm hexter carla whysynth calf dssi-vst arty-fx mda-lv2 nekobee \
    avldrums.lv2 meters.lv2 setbfree tuna.lv2 fil4.lv2 \
    qmidiarp infamousplugins hydrogen hydrogen-drumkits \
    distrho-ports distrho-ports-presets \
    triceratops-lv2 \
    yoshimi zynaddsubfx \
    guitarix \
    polyphone \
    mixxx \
"
