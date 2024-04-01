package X;

import android.database.Cursor;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2AP  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AP {
    public static volatile C2AP A05;
    public final C0F2 A00;
    public final C47602Bw A02;
    public final C2CB A03;
    public volatile boolean A04 = false;
    public final C2CA A01 = new C2CA();

    public C2AP(C40431sF c40431sF, C2CB c2cb, C0F2 c0f2) {
        this.A02 = new C47602Bw(c40431sF.A06());
        this.A03 = c2cb;
        this.A00 = c0f2;
    }

    public static C2AP A00() {
        if (A05 == null) {
            synchronized (C2AP.class) {
                if (A05 == null) {
                    C40431sF A00 = C40431sF.A00();
                    if (C2CB.A01 == null) {
                        synchronized (C2CB.class) {
                            if (C2CB.A01 == null) {
                                C2CB.A01 = new C2CB(C0F2.A00());
                            }
                        }
                    }
                    A05 = new C2AP(A00, C2CB.A01, C0F2.A00());
                }
            }
        }
        return A05;
    }

    public final void A01() {
        if (this.A04) {
            return;
        }
        synchronized (this.A01) {
            if (!this.A04) {
                Iterator it = ((ArrayList) this.A02.A00()).iterator();
                while (it.hasNext()) {
                    C47612Bx c47612Bx = (C47612Bx) it.next();
                    if (c47612Bx.A01 == null) {
                        try {
                            C2CB c2cb = this.A03;
                            File A052 = c2cb.A00.A05(c47612Bx.A09);
                            if (A052.exists()) {
                                c47612Bx.A01 = WebpUtils.A00(A052.getAbsolutePath());
                                this.A02.A01(c47612Bx);
                            } else {
                                throw new FileNotFoundException("StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker");
                                break;
                            }
                        } catch (FileNotFoundException e) {
                            Log.e("StarredStickers/initStickerDedupeMappings/could not get internally managed media file for sticker, dropping it from starred", e);
                            this.A02.A02(c47612Bx.A09);
                        }
                    }
                    this.A01.A01(c47612Bx.A09, c47612Bx.A01);
                }
                this.A04 = true;
            }
        }
    }

    public boolean A02(String str) {
        boolean containsKey;
        C000700j.A00();
        if (this.A04) {
            C2CA c2ca = this.A01;
            synchronized (c2ca) {
                containsKey = c2ca.A00.containsKey(str);
            }
            return containsKey;
        }
        C47602Bw c47602Bw = this.A02;
        if (c47602Bw != null) {
            try {
                Cursor A09 = c47602Bw.A00.A02().A02.A09("starred_stickers", new String[]{"plaintext_hash"}, "plaintext_hash = ?", new String[]{str}, null, "checkStickerHashIsStarred/QUERY_STARRED_STICKER");
                boolean z = A09.getCount() > 0;
                A09.close();
                return z;
            } finally {
            }
        } else {
            throw null;
        }
    }
}
