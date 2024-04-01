package X;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;

/* renamed from: X.0Fj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03350Fj {
    public static volatile C03350Fj A03;
    public C000400f A00;
    public C001200o A01;
    public C000500h A02;

    public C03350Fj(C001200o c001200o, C000400f c000400f, C000500h c000500h) {
        this.A01 = c001200o;
        this.A00 = c000400f;
        this.A02 = c000500h;
    }

    public static final Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath(str);
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_country_code", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str3);
        }
        return appendPath.build();
    }

    public static C03350Fj A01() {
        if (A03 == null) {
            synchronized (C03350Fj.class) {
                if (A03 == null) {
                    A03 = new C03350Fj(C001200o.A01, C000400f.A00(), C000500h.A00());
                }
            }
        }
        return A03;
    }

    public final int A02(FileDescriptor fileDescriptor, File file) {
        Log.i("MigrateFileDirectlyHelper/replaceFile");
        try {
            C02D c02d = new C02D(this.A00.A04, file);
            FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
            C03460Fu.A0B(fileInputStream.getChannel(), Channels.newChannel(c02d));
            c02d.close();
            fileInputStream.close();
            c02d.close();
            return 19;
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("MigrateFileDirectlyHelper/replaceFile/error while moving file. File to replace is ");
            A0P.append(file.toString());
            A0P.append(" error message is: ");
            A0P.append(e);
            Log.e(A0P.toString());
            return (e.getMessage() == null || !e.getMessage().contains("No space")) ? 15 : 5;
        }
    }

    public int A03(String str, File file) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.A01.A00.getContentResolver().openFileDescriptor(A00(str, this.A02.A0H(), this.A02.A0J()), "r");
            if (openFileDescriptor != null) {
                try {
                    if (openFileDescriptor.getFileDescriptor() != null) {
                        int A02 = A02(openFileDescriptor.getFileDescriptor(), file);
                        openFileDescriptor.close();
                        return A02;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (openFileDescriptor != null) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th2;
                    }
                }
            }
            Log.i("MigrateFileDirectlyHelper/migrateFile/consumer file is null");
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return 15;
            }
            return 15;
        } catch (IOException | SecurityException e) {
            StringBuilder sb = new StringBuilder("MigrateFileDirectlyHelper/migrateFile/error while fetching internal file: ");
            sb.append(str);
            sb.append(" from consumer app. error message is: ");
            sb.append(e);
            Log.e(sb.toString());
            return 15;
        }
    }
}
