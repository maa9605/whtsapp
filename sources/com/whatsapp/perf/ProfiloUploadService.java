package com.whatsapp.perf;

import X.AbstractC000600i;
import X.AnonymousClass035;
import X.C000500h;
import X.C001400q;
import X.C004902f;
import X.C05070Ne;
import X.C0E7;
import X.C1ML;
import X.InterfaceC05060Nd;
import android.content.Intent;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ProfiloUploadService extends C1ML {
    public AbstractC000600i A00;
    public C0E7 A01;
    public C000500h A02;
    public AnonymousClass035 A03;
    public C004902f A04;

    @Override // X.AbstractServiceC05030Na
    public void A05(Intent intent) {
        File[] listFiles;
        int length;
        File file = new File(getCacheDir(), "profilo/upload");
        if (!file.exists() || (listFiles = file.listFiles(new FilenameFilter() { // from class: X.3SR
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return str.endsWith(".log");
            }
        })) == null || (length = listFiles.length) == 0) {
            return;
        }
        for (int i = 1; i < length; i++) {
            listFiles[i].delete();
            listFiles[i].getPath();
        }
        final File file2 = listFiles[0];
        if (this.A01.A03(true) != 1) {
            file2.delete();
            return;
        }
        try {
            C05070Ne c05070Ne = new C05070Ne(this.A03, "https://crashlogs.whatsapp.net/wa_profilo_data", this.A04.A02(), new InterfaceC05060Nd() { // from class: X.3kA
                @Override // X.InterfaceC05060Nd
                public void AO0(Map map, String str) {
                }

                @Override // X.InterfaceC05060Nd
                public void AJD(long j) {
                    file2.delete();
                }

                @Override // X.InterfaceC05060Nd
                public void AJz(Map map, String str) {
                    C000200d.A13("ProfiloUpload/Error: ", str);
                }
            }, false, false);
            List list = c05070Ne.A0C;
            list.add(Pair.create("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af"));
            list.add(Pair.create("from", this.A00.A05()));
            c05070Ne.A05(new FileInputStream(file2), "file", file2.getName(), 0L, file2.length());
            list.add(Pair.create("agent", C004902f.A01(((C001400q) this.A00).A08, "2.21.9.15-play-release")));
            list.add(Pair.create("device_id", this.A02.A0G()));
            c05070Ne.A01(null);
        } catch (Exception | OutOfMemoryError e) {
            Log.w("ProfiloUpload/Error Uploading file", e);
            file2.delete();
        }
    }
}
