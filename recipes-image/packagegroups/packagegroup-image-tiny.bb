SUMMARY = "All packages required for a base image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

MACHINE_SPECIFICS_TINY = ""

RDEPENDS_${PN} = " \
    plymouth plymouth-set-default-theme plymouth-initrd \
    xdg-user-dirs \
    \
    evince \
    geany \
    \
    ntp ntp-utils \
    tzdata \
    dnsmasq \
    bind \
    wireless-tools \
    \
    bash-completion \
    dconf-editor \
    ${MACHINE_SPECIFICS_TINY} \
"
