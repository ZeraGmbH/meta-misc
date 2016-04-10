SUMMARY = "All qt5 core - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
	qt3d \
	qt5-creator \
	qtbase-native \
	qtbase \
	qtcanvas3d \
	qtconnectivity \
	qtdeclarative \
	qtenginio \
	qtgraphicaleffects \
	qtimageformats \
	qtlocation \
	qtmultimedia \
	qtquick1 \
	qtquickcontrols \
    qtquickcontrols2 \
	qtscript \
	qtsensors \
	qtserialport \
	qtsvg \
	qtsystems \
	qttools \
	qttranslations \
	qtwayland-native \
	qtwayland \
	qtwebchannel \
	qtwebengine \
	qtwebkit-examples \
	qtwebkit \
	qtwebsockets \
	qtx11extras \
	qtxmlpatterns \
"
