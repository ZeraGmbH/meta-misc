DESCRIPTION = "This recipe adds a user 'operator' without password"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r2"

inherit allarch

USERNAME = "operator"

pkg_postinst_${PN}() {
if [ "x$D" != "x" ]; then
	exit 1
fi
groupadd -f ${USERNAME}
useradd -m -c Operator -d /home/${USERNAME} -s /bin/bash -k /etc/skel -g ${USERNAME} ${USERNAME}
passwd -d ${USERNAME}
}

pkg_postrm_${PN}() {
userdel -rf ${USERNAME}
}

ALLOW_EMPTY_${PN} = "1"
