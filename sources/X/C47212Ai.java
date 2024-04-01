package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2Ai */
/* loaded from: classes2.dex */
public class C47212Ai {
    public static volatile C47212Ai A0C;
    public final AbstractC000600i A00;
    public final C012005w A01;
    public final C01B A02;
    public final C41651uI A03;
    public final AnonymousClass012 A04;
    public final C0C9 A05;
    public final C00A A06;
    public final C2BQ A07;
    public final C2BP A08;
    public final AnonymousClass227 A09;
    public final ExecutorC004702d A0A;
    public final InterfaceC002901k A0B;

    public C47212Ai(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C012005w c012005w, C2BP c2bp, C01B c01b, AnonymousClass227 anonymousClass227, C2BQ c2bq, C0C9 c0c9, C00A c00a, C41651uI c41651uI) {
        this.A04 = anonymousClass012;
        this.A00 = abstractC000600i;
        this.A0B = interfaceC002901k;
        this.A01 = c012005w;
        this.A08 = c2bp;
        this.A02 = c01b;
        this.A09 = anonymousClass227;
        this.A07 = c2bq;
        this.A0A = new ExecutorC004702d(interfaceC002901k, false);
        this.A05 = c0c9;
        this.A06 = c00a;
        this.A03 = c41651uI;
    }

    public static C47212Ai A00() {
        if (A0C == null) {
            synchronized (C47212Ai.class) {
                if (A0C == null) {
                    A0C = new C47212Ai(AnonymousClass012.A00(), AbstractC000600i.A00(), C002801j.A00(), C012005w.A00(), C2BP.A00(), C01B.A00(), AnonymousClass227.A00(), C2BQ.A00(), C0C9.A00(), C00A.A00, C41651uI.A00);
                }
            }
        }
        return A0C;
    }

    public static void A01(C47212Ai c47212Ai, AnonymousClass092 anonymousClass092) {
        AnonymousClass097 anonymousClass097;
        C09H c09h;
        if ((anonymousClass092 instanceof C0LO) && (c09h = (anonymousClass097 = (AnonymousClass097) anonymousClass092).A02) != null && c09h.A0O && !c09h.A0a && c09h.A0P) {
            c47212Ai.A0A.execute(new RunnableEBaseShape2S0200000_I0_2(c47212Ai, anonymousClass097, 12));
        }
    }

    public void A02(File file, int i, int i2, int i3, long j) {
        this.A0A.execute(new RunnableC61262vr(this, file, i, i2, i3, j));
    }

    public final boolean A03(C2BR c2br) {
        C012005w c012005w = this.A01;
        File file = new File(c012005w.A0C(), c2br.A04.replace('/', '-'));
        try {
            if (!file.exists()) {
                AnonymousClass024.A0P(c012005w.A04, new File(c2br.A03), file);
            }
            c2br.A03 = file.getAbsolutePath();
            C0CD c0cd = new C0CD(null, this.A07.A02().A00, true);
            C03790Hb A00 = c0cd.A00();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("plain_file_hash", c2br.A04);
                contentValues.put("file_path", c2br.A03);
                contentValues.put("height", Integer.valueOf(c2br.A01));
                contentValues.put("width", Integer.valueOf(c2br.A02));
                contentValues.put("gif_attribution", Integer.valueOf(c2br.A00));
                c0cd.A02.A06("gifs", contentValues, 5);
                A00.A00();
                c0cd.close();
                return true;
            } finally {
            }
        } catch (Exception unused) {
            Log.e("GifManager/add/error saving gif to disk");
            return false;
        }
    }
}
