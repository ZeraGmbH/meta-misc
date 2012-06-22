require xfce-base-image.bb

export IMAGE_BASENAME = "xfce-full-image"

IMAGE_INSTALL += " \
	xdg-user-dirs-gtk \
	lxdm-systemd \
	\
	midori \
	epdfview \
	gimp \
	gnome-bluetooth \
	gnome-disk-utility \
	florence \
	xarchiver \
	\
	strace \
	\
	libgles-omap3-x11demos \
"


#	gdm-systemd gdm-allow-root-login angstrom-gdm-xfce-hack
#	lightdm-gtk-greeter lightdm-systemd
#	slim-systemd

#	evince
#	firefox

#	ntp-systemd
#	cherokee-systemd

#	gedit
#	gateone
#	chromium
#	orage
