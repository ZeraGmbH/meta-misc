require xfce-base-image.bb

export IMAGE_BASENAME = "xfce-full-image"

IMAGE_INSTALL += " \
	packagegroup-xfce-extended \
	packagegroup-xfce-multimedia \
	xdg-user-dirs-gtk \
	lxdm \
	\
	midori \
	firefox \
	epdfview \
	gimp \
	gnome-bluetooth \
	gnome-disk-utility \
	florence \
	xarchiver \
	gedit \
	parole \
	\
	strace \
	\
	libgles-omap3-x11demos \
	\
	devilspie2 \
	\
	bash-completion \
	xfce4-closebutton-plugin \
	glade3 \
	libxfce4ui-glade \
"


#	gdm gdm-allow-root-login angstrom-gdm-xfce-hack
#	lightdm-gtk-greeter lightdm
#	slim

#	evince

#	ntp
#	cherokee

#	gateone
#	chromium
#	orage
