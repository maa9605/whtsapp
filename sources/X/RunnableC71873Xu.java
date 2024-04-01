package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.3Xu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC71873Xu extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C2AS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ RunnableC71873Xu(C2AS c2as, String str, String str2) {
        this.A00 = c2as;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C04050If c04050If;
        C2CI[] c2ciArr;
        C2AS c2as = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        try {
            C47512Bn c47512Bn = c2as.A0M;
            C42531vt A04 = c47512Bn.A02.A04(str, str2);
            c47512Bn.A05.A01(C47582Bu.A03(c47512Bn.A01.A00, A04), A04);
            if (!A04.A0L) {
                c47512Bn.A04.A02(str, str2, A04.A04);
                for (C0JM c0jm : A04.A04) {
                    String str3 = c0jm.A0B;
                    if (str3 != null && (c04050If = c0jm.A04) != null && (c2ciArr = c04050If.A06) != null) {
                        C2CD c2cd = c47512Bn.A06;
                        String A00 = C0JM.A00(c2ciArr);
                        if (c2cd != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("plaintext_hash", str3);
                            contentValues.put("authority", str);
                            contentValues.put("sticker_pack_id", str2);
                            contentValues.put("emojis", A00);
                            C0CD A03 = c2cd.A00.A03();
                            A03.A02.A06("third_party_sticker_emoji_mapping", contentValues, 5);
                            A03.close();
                        } else {
                            throw null;
                        }
                    }
                }
            }
            c47512Bn.A07.A02(str, str2, A04);
            c2as.A0R.A01(A04.A0D);
            c2as.A0F.A0H(c2as.A0A(c2as.A0D()), "add");
        } catch (Exception unused) {
            Log.e("StickerRepository/InstallThirdPartyStickerPackAsyncTask failed to install third party pack");
        }
        c2as.A04.A02.post(new RunnableEBaseShape0S2100000_I0(c2as, str, str2, 7));
    }
}
