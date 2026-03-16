[isi README.md]
# Icon Pack Maker 🎨

Aplikasi Android untuk membuat Icon Pack dengan mudah. Aplikasi ini memungkinkan Anda mengimpor gambar, mengedit ikon, melihat preview, dan mengekspor sebagai APK icon pack.

## Fitur ✨

- 📥 **Impor Gambar**: Impor gambar dari galeri atau file ZIP
- ✏️ **Edit Ikon**: Ubah ukuran, potong, dan putar ikon
- 👁️ **Preview**: Lihat preview icon pack sebelum export
- 📋 **Metadata**: Atur nama aplikasi, penulis, versi, dan package name
- 📦 **Export APK**: Export sebagai APK siap pakai

## Teknologi 🛠️

- **Language**: Kotlin
- **Framework**: Android Framework
- **Architecture**: MVVM (Model-View-ViewModel)
- **UI**: Material Design 3
- **Build Tool**: Gradle

## Struktur Project 📁
icon-pack-maker/
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── kotlin/com/greypick/iconpackmaker/
│ │ │ │ ├── ui/ # Activities (UI Layer)
│ │ │ │ ├── viewmodel/ # ViewModels
│ │ │ │ ├── model/ # Data Models
│ │ │ │ ├── util/ # Utility Classes
│ │ │ │ └── repository/ # Data Repository
│ │ │ ├── res/ # Resources (layouts, strings, colors, etc)
│ │ │ └── AndroidManifest.xml
│ │ └── test/
│ ├── build.gradle.kts
│ └── proguard-rules.pro
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md
## Dependencies 📚

- AndroidX Core KTX
- AndroidX AppCompat
- AndroidX Constraint Layout
- Material Design 3
- Kotlin Coroutines
- AndroidX Lifecycle
- Commons IO

## Cara Membangun 🚀

### Prerequisites
- Android SDK API 24+
- Gradle 7.0+
- JDK 1.8+

### Build APK
```bash
./gradlew assembleDebug
