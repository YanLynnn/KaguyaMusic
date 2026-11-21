# Kaguya

Pemutar musik Android (Jetpack Compose + Media3) dengan tema "Neo Pop": krem, outline tebal, dan warna permen.

Maintainer fork ini: **YanXian**.

## Asal-usul & lisensi (WAJIB dipertahankan)

Kaguya adalah **fork** dari proyek open source **Kuro** oleh **ayashiiiyo**
(https://github.com/ayashiiiyo/kuro). Proyek ini bergantung pada
**NewPipeExtractor** (Team NewPipe, GPL-3.0), sehingga turunannya harus tetap
berlisensi **GPL-3.0-or-later**.

Konsekuensinya:
- Boleh dimodifikasi, diganti nama, dan didistribusikan ulang.
- Wajib tetap GPL-3.0, menyertakan teks lisensi, dan menyediakan source code.
- Wajib mempertahankan pemberitahuan hak cipta / kredit pemilik asli.
- Wajib menandai bahwa file telah diubah.

Lihat `NOTICE.md`. Tambahkan salinan teks GPL-3.0 sebagai file `LICENSE`
(https://www.gnu.org/licenses/gpl-3.0.txt) sebelum merilis.

## Build

```
cargo install cargo-ndk
cargo ndk -t arm64-v8a -t armeabi-v7a -o app/src/main/jniLibs build --release --manifest-path kaguya-core/Cargo.toml
./gradlew assembleDebug
```

Auto-update nonaktif secara default. Untuk mengaktifkan, isi `UPDATE_REPO`
di `UpdateManager.kt` dengan `owner/repo` GitHub milikmu.
