require gnome2-base-image.bb

export IMAGE_BASENAME = "gnome2-tiny-image"

IMAGE_INSTALL += " \
    gdm \
    gnome-bluetooth \
    gnome-mplayer \
"
