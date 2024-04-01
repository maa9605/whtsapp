package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.04t  reason: invalid class name */
/* loaded from: classes.dex */
public class C04t {
    public final C04j A00;
    public final AnonymousClass012 A01;

    public C04t(AnonymousClass012 anonymousClass012, C04j c04j) {
        this.A01 = anonymousClass012;
        this.A00 = c04j;
    }

    public void A00(C0IO c0io, AnonymousClass094 anonymousClass094) {
        String A0N = C000200d.A0N(C000200d.A0P("msg_key_remote_jid = ? AND recipient_id = ? AND device_id = ? AND msg_key_from_me"), anonymousClass094.A02 ? " != " : " = ", "0 AND ", "msg_key_id", " = ?");
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            try {
                long A01 = this.A00.A02().A02.A01("message_base_key", A0N, new String[]{abstractC005302j.getRawString(), c0io.A01, String.valueOf(c0io.A00), anonymousClass094.A01});
                int i = A01 <= 0 ? 5 : 3;
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl deleted ");
                sb.append(A01);
                sb.append(" message base key rows for ");
                sb.append(anonymousClass094);
                Log.log(i, sb.toString());
            } finally {
            }
        } else {
            throw null;
        }
    }

    public void A01(C0IO c0io, AnonymousClass094 anonymousClass094, byte[] bArr) {
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            String rawString = abstractC005302j.getRawString();
            C0CD A02 = this.A00.A02();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("msg_key_remote_jid", rawString);
                contentValues.put("recipient_id", c0io.A01);
                contentValues.put("device_id", Integer.valueOf(c0io.A00));
                contentValues.put("msg_key_from_me", Boolean.valueOf(anonymousClass094.A02));
                contentValues.put("msg_key_id", anonymousClass094.A01);
                contentValues.put("last_alice_base_key", bArr);
                contentValues.put("timestamp", Long.valueOf(this.A01.A05() / 1000));
                long A05 = A02.A02.A05("message_base_key", contentValues);
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl saved a message base key for ");
                sb.append(anonymousClass094);
                sb.append(" with row id ");
                sb.append(A05);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A02.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        throw null;
    }
}
