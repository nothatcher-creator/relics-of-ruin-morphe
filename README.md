# Relics of Ruin

Experimental Morphe patch source for **Terraria Android 1.4.5.8.5**.

## 0.1.3 diagnostic build

Versions 0.1.1 and 0.1.2 successfully patched the APK but Terraria crashed immediately at runtime.

0.1.3 is deliberately a **no-op patch**:
- no DEX instruction injection
- no runtime extension
- no resource changes
- no native-library changes
- no licensing/integrity modifications

Its only purpose is to determine whether Terraria can launch after Morphe rebuilds/re-signs this particular APK.

### Interpretation

- **If 0.1.3 launches:** our previous runtime injection was the crash source, and we can choose a safer hook.
- **If 0.1.3 still crashes:** the uploaded APK is incompatible with Morphe's rebuild/re-sign process, likely because of its existing signing/integrity/repackaging setup. In that case the correct next step is to test a clean, legitimately obtained Terraria APK rather than bypassing integrity protections.

Target:
- Package: `com.and.games505.TerrariaPaid`
- Version: `1.4.5.8.5`
- Engine: Unity / IL2CPP

This project does not modify licensing, Pairip, billing, ownership checks, anti-tamper logic, or signature verification.
