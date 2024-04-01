package X;

import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.io.File;

/* renamed from: X.1sw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40831sw extends MediaMetadataRetriever implements Closeable {
    public void A00(File file) {
        setDataSource(file.getAbsolutePath());
    }

    @Override // android.media.MediaMetadataRetriever, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        release();
        AnonymousClass024.A0R(null);
    }
}
