require ../console/console-base-image-nm.bb

export IMAGE_BASENAME = "allagui-base-image"

CONMANPKGS = "networkmanager"

# currently: plasma / xfce / lxqt
# not included: gnome / efl
IMAGE_INSTALL += " \
    packagegroup-core-x11-xserver \
    packagegroup-image-base \
    \
    sddm \
    \
    \
    plasma-world \
    \
    \
    packagegroup-gnome-xserver-base \
    angstrom-clearlooks-theme-enable \
    angstrom-gnome-icon-theme-enable \
    packagegroup-xfce-base \
    xfce4-default-touch-config \
    \
    \
    packagegroup-lxqt-base \
    lxqt-default-config \
    \
    \
    hawaii-world \
    \
    fluxbox \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
