require ../console/console-base-image-nm.bb

export IMAGE_BASENAME = "allagui-base-image"

# currently: plasma / xfce / lxqt
# not included: gnome / efl
IMAGE_INSTALL += " \
    packagegroup-core-x11-xserver \
    packagegroup-image-base \
    \
    sddm \
    \
    \
    kf5-world \
    plasma-world \
    \
    \
    packagegroup-gnome-xserver-base \
    angstrom-clearlooks-theme-enable \
    angstrom-gnome-icon-theme-enable \
    packagegroup-xfce-base \
    xfce4-default-config \
    \
    \
    packagegroup-lxqt-base \
    lxqt-default-config \
    \
    \
    hawaii-world \
    \
    fluxbox \
    \
    weston \
    \
    \
    mesa-demos \
    glmark2 \
    eglinfo-x11 \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
