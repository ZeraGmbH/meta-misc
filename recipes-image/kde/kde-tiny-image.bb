require kde-base-image.bb

export IMAGE_BASENAME = "kde-tiny-image"

IMAGE_INSTALL += " \
    packagegroup-image-tiny \
    \
    kde-world \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
