SUMMARY = "All packages required for a base image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    evince \
    \
    strace \
    \
    ntp ntp-utils \
    tzdata \
    dnsmasq \
    bind \
    wireless-tools \
    \
    gparted \
    \
    bash-completion \
"
