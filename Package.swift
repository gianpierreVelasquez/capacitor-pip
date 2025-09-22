// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorPip",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "CapacitorPip",
            targets: ["PictureInPicturePlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "PictureInPicturePlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/PictureInPicturePlugin"),
        .testTarget(
            name: "PictureInPicturePluginTests",
            dependencies: ["PictureInPicturePlugin"],
            path: "ios/Tests/PictureInPicturePluginTests")
    ]
)