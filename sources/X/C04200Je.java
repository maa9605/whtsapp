package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* renamed from: X.0Je  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04200Je extends C0JU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public byte[] A0C;

    public C04200Je(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 35);
    }

    @Override // X.C0JU
    public String A19() {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (!TextUtils.isEmpty(this.A08)) {
                jsonWriter.name("direct_path").value(this.A08);
            }
            if (!TextUtils.isEmpty(this.A0A)) {
                jsonWriter.name("media_hash").value(this.A0A);
            }
            if (!TextUtils.isEmpty(this.A09)) {
                jsonWriter.name("enc_media_hash").value(this.A09);
            }
            if (!TextUtils.isEmpty(this.A0B)) {
                jsonWriter.name("original-msg-id").value(this.A0B);
            }
            jsonWriter.name("file_length").value(this.A04).name("sync_type").value(this.A03).name("chunk_order").value(this.A00).name("progress").value(this.A01).name("retries").value(this.A02).name("latest_msg_id").value(this.A05).name("oldest_msg_id").value(this.A06).name("oldest_msg_id_to_sync").value(this.A07);
            byte[] bArr = this.A0C;
            if (bArr != null) {
                jsonWriter.name("key_data").value(Base64.encodeToString(bArr, 2));
            }
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            Log.e("FMessageHistorySyncNotification/writeData failed", e);
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
                switch (nextName.hashCode()) {
                    case -1906067869:
                        if (!nextName.equals("original-msg-id")) {
                            break;
                        } else {
                            this.A0B = jsonReader.nextString();
                            continue;
                        }
                    case -1641051461:
                        if (!nextName.equals("direct_path")) {
                            break;
                        } else {
                            this.A08 = jsonReader.nextString();
                            continue;
                        }
                    case -1001078227:
                        if (!nextName.equals("progress")) {
                            break;
                        } else {
                            this.A01 = jsonReader.nextInt();
                            continue;
                        }
                    case -339500935:
                        if (!nextName.equals("oldest_msg_id_to_sync")) {
                            break;
                        } else {
                            this.A07 = jsonReader.nextLong();
                            continue;
                        }
                    case -50870532:
                        if (!nextName.equals("chunk_order")) {
                            break;
                        } else {
                            this.A00 = jsonReader.nextInt();
                            continue;
                        }
                    case 494573150:
                        if (!nextName.equals("sync_type")) {
                            break;
                        } else {
                            this.A03 = jsonReader.nextInt();
                            continue;
                        }
                    case 500641162:
                        if (!nextName.equals("key_data")) {
                            break;
                        } else {
                            this.A0C = Base64.decode(jsonReader.nextString(), 2);
                            continue;
                        }
                    case 1098377542:
                        if (!nextName.equals("retries")) {
                            break;
                        } else {
                            this.A02 = jsonReader.nextInt();
                            continue;
                        }
                    case 1120684249:
                        if (!nextName.equals("oldest_msg_id")) {
                            break;
                        } else {
                            this.A06 = jsonReader.nextLong();
                            continue;
                        }
                    case 1190721806:
                        if (!nextName.equals("enc_media_hash")) {
                            break;
                        } else {
                            this.A09 = jsonReader.nextString();
                            continue;
                        }
                    case 1836211977:
                        if (!nextName.equals("file_length")) {
                            break;
                        } else {
                            this.A04 = jsonReader.nextLong();
                            continue;
                        }
                    case 1894532689:
                        if (!nextName.equals("latest_msg_id")) {
                            break;
                        } else {
                            this.A05 = jsonReader.nextLong();
                            continue;
                        }
                    case 1939495049:
                        if (!nextName.equals("media_hash")) {
                            break;
                        } else {
                            this.A0A = jsonReader.nextString();
                            continue;
                        }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("FMessageHistorySyncNotification/readData/unexpected name \"");
                sb.append(nextName);
                sb.append("\"");
                Log.w(sb.toString());
            }
            jsonReader.endObject();
            jsonReader.close();
        } catch (IOException e) {
            Log.e("FMessageHistorySyncNotification/readData failed", e);
        }
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        EnumC79243lL enumC79243lL;
        C40541sR c40541sR = c40551sS.A01;
        C48502Fm c48502Fm = (C48502Fm) c40541sR.A07().AVX();
        C87643zz c87643zz = (C87643zz) ((C48512Fn) c48502Fm.A00).A0l().AVX();
        long j = this.A04;
        c87643zz.A02();
        AnonymousClass400 anonymousClass400 = (AnonymousClass400) c87643zz.A00;
        anonymousClass400.A00 |= 2;
        anonymousClass400.A03 = j;
        int i = this.A03;
        if (i == 0) {
            enumC79243lL = EnumC79243lL.INITIAL_BOOTSTRAP;
        } else if (i == 1) {
            enumC79243lL = EnumC79243lL.INITIAL_STATUS_V3;
        } else if (i == 2) {
            enumC79243lL = EnumC79243lL.RECENT;
        } else if (i == 3) {
            enumC79243lL = EnumC79243lL.FULL;
        } else if (i == 4) {
            enumC79243lL = EnumC79243lL.PUSH_NAME;
        } else {
            throw new IllegalArgumentException(C000200d.A0E("Unexpected type (", i, ")"));
        }
        c87643zz.A02();
        AnonymousClass400.A0C((AnonymousClass400) c87643zz.A00, enumC79243lL);
        int i2 = this.A00;
        if (i2 > 0) {
            c87643zz.A02();
            AnonymousClass400 anonymousClass4002 = (AnonymousClass400) c87643zz.A00;
            anonymousClass4002.A00 |= 64;
            anonymousClass4002.A01 = i2;
        }
        String str = this.A08;
        if (str != null) {
            c87643zz.A02();
            AnonymousClass400.A0D((AnonymousClass400) c87643zz.A00, str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            C0AN A00 = C0AN.A00(Base64.decode(str2, 0));
            c87643zz.A02();
            AnonymousClass400.A09((AnonymousClass400) c87643zz.A00, A00);
        }
        String str3 = this.A09;
        if (str3 != null) {
            C0AN A002 = C0AN.A00(Base64.decode(str3, 0));
            c87643zz.A02();
            AnonymousClass400.A0B((AnonymousClass400) c87643zz.A00, A002);
        }
        byte[] bArr = this.A0C;
        if (bArr != null) {
            C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
            c87643zz.A02();
            AnonymousClass400.A0A((AnonymousClass400) c87643zz.A00, A01);
        }
        if (!TextUtils.isEmpty(this.A0B)) {
            String str4 = this.A0B;
            c87643zz.A02();
            AnonymousClass400.A0E((AnonymousClass400) c87643zz.A00, str4);
        }
        EnumC55282kA enumC55282kA = EnumC55282kA.HISTORY_SYNC_NOTIFICATION;
        c48502Fm.A02();
        C48512Fn.A0B((C48512Fn) c48502Fm.A00, enumC55282kA);
        c48502Fm.A02();
        C48512Fn.A09((C48512Fn) c48502Fm.A00, c87643zz);
        c40541sR.A02();
        C40531sQ.A0X((C40531sQ) c40541sR.A00, c48502Fm);
    }
}
