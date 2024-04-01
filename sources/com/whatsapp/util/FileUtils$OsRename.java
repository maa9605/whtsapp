package com.whatsapp.util;

import X.C000200d;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

/* loaded from: classes.dex */
public class FileUtils$OsRename {
    public static int attempt(File file, File file2) {
        try {
            Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
            return -1;
        } catch (ErrnoException e) {
            StringBuilder A0P = C000200d.A0P("MMS Os.rename also failed, from=");
            A0P.append(file.getAbsolutePath());
            A0P.append(" to=");
            A0P.append(file2.getAbsolutePath());
            A0P.append(" errno=");
            A0P.append(e.errno);
            Log.e(A0P.toString(), e);
            return e.errno;
        }
    }
}
