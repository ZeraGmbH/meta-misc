require xfce4-full-image.bb

export IMAGE_BASENAME = "xfce4-games-image"

IMAGE_INSTALL += " \
    atanks \
    freeciv \
    pingus \
    scummvm \
    supertux2 \
    wesnoth \
    gnome-games \
    freeciv \
    etr \
    \
    libgles-omap3-x11demos \
"

