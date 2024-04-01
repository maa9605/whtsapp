package com.whatsapp;

import X.C000200d;
import X.C000400f;
import X.C003701t;
import X.C012005w;
import X.C04100In;
import X.C0DD;
import X.C42591vz;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class Mp4Ops {
    public static volatile Mp4Ops A02;
    public final C000400f A00;
    public final C003701t A01;

    public static native LibMp4OperationResult mp4check(String str, boolean z);

    public static native LibMp4CheckAndRepairResult mp4checkAndRepair(String str, String str2);

    public static native boolean mp4forensic(int i, String str, String str2);

    public static native LibMp4OperationResult mp4mux(String str, String str2, String str3, float f, float f2, float f3, float f4, int i, String str4, float f5);

    public static native LibMp4OperationResult mp4removeDolbyEAC3Track(String str, String str2);

    public static native LibMp4StreamCheckResult mp4streamcheck(String str, boolean z, long j);

    public static native LibMp4OperationResult removeAudioTracks(String str, String str2);

    public Mp4Ops(C003701t c003701t, C000400f c000400f) {
        this.A01 = c003701t;
        this.A00 = c000400f;
    }

    public static Mp4Ops A00() {
        if (A02 == null) {
            synchronized (Mp4Ops.class) {
                if (A02 == null) {
                    C003701t A00 = C003701t.A00();
                    C012005w.A00();
                    A02 = new Mp4Ops(A00, C000400f.A00());
                }
            }
        }
        return A02;
    }

    public static void A01(C000400f c000400f, File file) {
        try {
            if (C42591vz.A06(file).A00 == 0) {
                return;
            }
            File A07 = c000400f.A07(file);
            LibMp4OperationResult removeAudioTracks = removeAudioTracks(file.getAbsolutePath(), A07.getAbsolutePath());
            if (removeAudioTracks.success) {
                if (C0DD.A0Q(c000400f, A07, file)) {
                    return;
                }
                Log.e("mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                throw new C04100In(0, "mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("mp4ops/remove-audio-tracks");
            sb.append(removeAudioTracks.errorMessage);
            Log.e(sb.toString());
            int i = removeAudioTracks.errorCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("invalid result, error_code: ");
            sb2.append(i);
            throw new C04100In(i, sb2.toString());
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            throw new C04100In(0, "Could not access file or failed to move files properly");
        }
    }

    public static void A02(File file, File file2) {
        try {
            Log.i("mp4ops/removeExifData/start");
            LibMp4OperationResult mp4mux = mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, 0.0f, -1.0f, -1.0f, -1, file.getAbsolutePath(), 0.0f);
            StringBuilder sb = new StringBuilder();
            sb.append("mp4ops/removeExifData/finished success=");
            sb.append(mp4mux.success);
            Log.i(sb.toString());
            if (mp4mux.success) {
                return;
            }
            if (mp4mux.ioException) {
                throw new IOException("mp4ops/removeExifData/No space");
            }
            int i = mp4mux.errorCode;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mp4ops/removeExifData failed, error_code: ");
            sb2.append(i);
            throw new C04100In(i, sb2.toString(), new Throwable());
        } catch (Error e) {
            Log.e("mp4ops/removeExifData/failed: mp4mux error, exiting", e);
            throw new C04100In(0, e.getMessage(), new Throwable());
        }
    }

    public static void A03(File file, File file2, File file3, File file4, int i, long j, long j2, long j3, long j4) {
        String absolutePath;
        Log.i("mp4ops/mux/start");
        float f = ((float) j) / 1000.0f;
        float f2 = ((float) j4) / 1000.0f;
        float f3 = ((float) j3) / 1000.0f;
        float f4 = ((float) j2) / 1000.0f;
        if (file2 == null) {
            absolutePath = "";
        } else {
            try {
                absolutePath = file2.getAbsolutePath();
            } catch (Error e) {
                Log.e("mp4ops/mux/failed: mp4mux error, exiting", e);
                throw new C04100In(0, e.getMessage(), new Throwable());
            }
        }
        LibMp4OperationResult mp4mux = mp4mux(absolutePath, file3 != null ? file3.getAbsolutePath() : "", file.getAbsolutePath(), f, 0.0f, f3, f4, i, file4.getAbsolutePath(), f2);
        C000200d.A1V(C000200d.A0P("mp4ops/mux/result: "), mp4mux.success);
        if (!mp4mux.success) {
            C000200d.A1M(C000200d.A0P("mp4ops/mux/error_message/"), mp4mux.errorMessage);
            if (mp4mux.ioException) {
                throw new IOException("No space");
            }
            StringBuilder A0P = C000200d.A0P("invalid result, error_code: ");
            int i2 = mp4mux.errorCode;
            A0P.append(i2);
            throw new C04100In(i2, A0P.toString(), new Throwable());
        }
        StringBuilder A0P2 = C000200d.A0P("mp4ops/mux/finished, size:");
        A0P2.append(file.length());
        Log.i(A0P2.toString());
    }

    public static void A04(File file, boolean z) {
        LibMp4OperationResult mp4check;
        Log.i("mp4ops/check/start");
        int i = 0;
        do {
            try {
                mp4check = mp4check(file.getAbsolutePath(), z);
                if (mp4check.success || !mp4check.ioException) {
                    break;
                }
                SystemClock.sleep(100L);
                i++;
            } catch (Error e) {
                Log.e("mp4ops/integration fail/", e);
                throw new C04100In(0, "integrity check error", new Throwable());
            }
        } while (i < 5);
        if (mp4check.success) {
            Log.i("mp4ops/check/finished");
            return;
        }
        StringBuilder A0P = C000200d.A0P("mp4ops/check/error_message/");
        A0P.append(mp4check.errorMessage);
        Log.e(A0P.toString());
        int i2 = mp4check.errorCode;
        StringBuilder A0P2 = C000200d.A0P("integrity check failed, error_code: ");
        A0P2.append(i2);
        throw new C04100In(i2, A0P2.toString(), new Throwable());
    }

    public boolean A05(File file) {
        Log.i("mp4ops/checkAndRepair/start");
        C000400f c000400f = this.A00;
        File A07 = c000400f.A07(file);
        StringBuilder A0P = C000200d.A0P("mp4ops/checkAndRepair/repairFileName.exists");
        A0P.append(A07.exists());
        Log.i(A0P.toString());
        try {
            LibMp4CheckAndRepairResult mp4checkAndRepair = mp4checkAndRepair(file.getAbsolutePath(), A07.getAbsolutePath());
            if (!mp4checkAndRepair.success) {
                if (mp4checkAndRepair.repaired) {
                    A07.delete();
                }
                C000200d.A1M(C000200d.A0P("mp4ops/checkAndRepair/error_message/"), mp4checkAndRepair.errorMessage);
                if (mp4checkAndRepair.ioException) {
                    throw new IOException("No space");
                }
                int i = mp4checkAndRepair.errorCode;
                StringBuilder A0P2 = C000200d.A0P("integrity check/repair failed, error_code: ");
                A0P2.append(i);
                throw new C04100In(i, A0P2.toString(), new Throwable());
            }
            Log.i("mp4ops/checkAndRepair/finished");
            if (mp4checkAndRepair.repaired) {
                StringBuilder A0P3 = C000200d.A0P("mp4ops/checkAndRepair/file_is_repaired, new file created and renamed: ");
                A0P3.append(A07.getAbsolutePath());
                Log.i(A0P3.toString());
                if (this.A01.A0C(239)) {
                    A02(A07, file);
                } else if (!A07.renameTo(file)) {
                    Log.i("mp4ops/checkAndRepair/rename_failed");
                    throw new IOException("unable to rename file");
                }
                return true;
            } else if (this.A01.A0C(239)) {
                Log.i("mp4ops/checkAndRepair/file_repair_not_needed but will remove exif data");
                File A072 = c000400f.A07(file);
                A02(file, A072);
                if (file.length() == A072.length()) {
                    return false;
                }
                if (A072.renameTo(file)) {
                    return true;
                }
                Log.i("mp4ops/checkAndRepair/rename_failed");
                throw new IOException("unable to rename file");
            } else {
                Log.i("mp4ops/checkAndRepair/file_repair_not_needed");
                return false;
            }
        } catch (Error e) {
            Log.e("mp4ops/integration fail/", e);
            throw new C04100In(0, "integrity check error", new Throwable());
        }
    }

    /* loaded from: classes.dex */
    public class LibMp4OperationResult {
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final int rotationDegrees;
        public final boolean success;

        public LibMp4OperationResult(boolean z, boolean z2, int i, int i2, String str) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.errorMessage = str;
            this.rotationDegrees = i2;
        }
    }

    /* loaded from: classes.dex */
    public class LibMp4CheckAndRepairResult {
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final long newMajorVersion;
        public final long newMinorVersion;
        public final int newOriginator;
        public final long newReleaseVersion;
        public final long oldMajorVersion;
        public final long oldMinorVersion;
        public final int oldOriginator;
        public final long oldReleaseVersion;
        public final boolean repairRequired;
        public final boolean repaired;
        public final boolean success;

        public LibMp4CheckAndRepairResult(boolean z, boolean z2, boolean z3, int i, String str, boolean z4, long j, long j2, long j3, int i2, long j4, long j5, long j6, int i3) {
            this.success = z;
            this.repaired = z2;
            this.repairRequired = z3;
            this.errorCode = i;
            this.errorMessage = str;
            this.ioException = z4;
            this.oldMajorVersion = j;
            this.oldMinorVersion = j2;
            this.oldReleaseVersion = j3;
            this.oldOriginator = i2;
            this.newMajorVersion = j4;
            this.newMinorVersion = j5;
            this.newReleaseVersion = j6;
            this.newOriginator = i3;
        }
    }

    /* loaded from: classes.dex */
    public class LibMp4StreamCheckResult {
        public final long bytesRequiredToExtractThumbnail;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;

        public LibMp4StreamCheckResult(boolean z, boolean z2, int i, String str, long j) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.errorMessage = str;
            this.bytesRequiredToExtractThumbnail = j;
        }
    }
}
