package X;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* renamed from: X.0XU  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XU extends C0JU {
    public boolean A00;

    public C0XU(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 47);
    }

    @Override // X.C0JU
    public String A19() {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject().name("security_notification_enabled").value(this.A00).endObject();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            Log.e("FMessageInitialSecurityNotificationSettingSync/writeData failed", e);
            return null;
        }
    }

    @Override // X.C0JU
    public void A1A(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName.hashCode() == 1518553996 && nextName.equals("security_notification_enabled")) {
                    this.A00 = jsonReader.nextBoolean();
                }
            }
            jsonReader.endObject();
            jsonReader.close();
        } catch (IOException e) {
            Log.e("FMessageInitialSecurityNotificationSettingSync/readData failed", e);
        }
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48502Fm c48502Fm = (C48502Fm) c40541sR.A07().AVX();
        AnonymousClass401 anonymousClass401 = (AnonymousClass401) ((C48512Fn) c48502Fm.A00).A0m().AVX();
        boolean z = this.A00;
        anonymousClass401.A02();
        AnonymousClass402 anonymousClass402 = (AnonymousClass402) anonymousClass401.A00;
        anonymousClass402.A00 |= 1;
        anonymousClass402.A01 = z;
        EnumC55282kA enumC55282kA = EnumC55282kA.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC;
        c48502Fm.A02();
        C48512Fn.A0B((C48512Fn) c48502Fm.A00, enumC55282kA);
        c48502Fm.A02();
        C48512Fn.A0A((C48512Fn) c48502Fm.A00, anonymousClass401);
        c40541sR.A02();
        C40531sQ.A0X((C40531sQ) c40541sR.A00, c48502Fm);
    }
}
