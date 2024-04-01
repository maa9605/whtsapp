package X;

import android.util.JsonWriter;
import com.whatsapp.dns.DnsCacheEntrySerializable;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.26X  reason: invalid class name */
/* loaded from: classes2.dex */
public class C26X {
    public static volatile C26X A04;
    public final AbstractC000600i A00;
    public final AnonymousClass012 A01;
    public final C001200o A02;
    public final C003701t A03;

    public C26X(AnonymousClass012 anonymousClass012, C003701t c003701t, C001200o c001200o, AbstractC000600i abstractC000600i) {
        this.A01 = anonymousClass012;
        this.A03 = c003701t;
        this.A02 = c001200o;
        this.A00 = abstractC000600i;
    }

    public static C26X A00() {
        if (A04 == null) {
            synchronized (C26X.class) {
                if (A04 == null) {
                    A04 = new C26X(AnonymousClass012.A00(), C003701t.A00(), C001200o.A01, AbstractC000600i.A00());
                }
            }
        }
        return A04;
    }

    public final ArrayList A01() {
        byte[] A0n = AnonymousClass024.A0n(new File(this.A02.A00.getFilesDir(), "fbips"));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(new String(A0n)).getJSONArray("fbips");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new DnsCacheEntrySerializable(Long.valueOf(jSONObject.getLong("exp")), InetAddress.getByName(jSONObject.getString("ip")), Short.valueOf((short) jSONObject.getInt("port")), jSONObject.getBoolean("secure"), jSONObject.getBoolean("override"), jSONObject.getInt("resolver")));
        }
        return arrayList;
    }

    public final void A02(ArrayList arrayList) {
        if (this.A03.A0C(505)) {
            FileWriter fileWriter = new FileWriter(new File(this.A02.A00.getFilesDir(), "fbips"));
            try {
                JsonWriter jsonWriter = new JsonWriter(fileWriter);
                jsonWriter.beginObject();
                jsonWriter.name("fbips");
                jsonWriter.beginArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DnsCacheEntrySerializable dnsCacheEntrySerializable = (DnsCacheEntrySerializable) it.next();
                    jsonWriter.beginObject();
                    jsonWriter.name("ip").value(dnsCacheEntrySerializable.inetAddress.getHostAddress());
                    jsonWriter.name("port").value(dnsCacheEntrySerializable.portNumber);
                    jsonWriter.name("exp").value(dnsCacheEntrySerializable.expirationTime);
                    jsonWriter.name("secure").value(dnsCacheEntrySerializable.secureSocket);
                    jsonWriter.name("override").value(dnsCacheEntrySerializable.forceOverride);
                    jsonWriter.name("resolver").value(dnsCacheEntrySerializable.resolverType);
                    jsonWriter.endObject();
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.close();
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        fileWriter.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(this.A02.A00.openFileOutput("fbips", 0)));
        objectOutputStream.writeObject(arrayList);
        objectOutputStream.close();
    }

    public synchronized void A03(String[] strArr) {
        C000700j.A00();
        if (strArr.length == 1 && strArr[0].equalsIgnoreCase("CLEAR")) {
            this.A02.A00.deleteFile("fbips");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                String[] split = str.split("\\|", 6);
                if (split.length != 6) {
                    C000200d.A13("DnsCacheEntrySerializable/parseFallbackIpString/", str);
                } else {
                    try {
                        InetAddress byName = InetAddress.getByName(split[0]);
                        short parseShort = Short.parseShort(split[1]);
                        long parseLong = Long.parseLong(split[2]);
                        arrayList.add(new DnsCacheEntrySerializable(Long.valueOf((Long.parseLong(split[3]) + parseLong) * 1000), byName, Short.valueOf(parseShort), Boolean.parseBoolean(split[4]), Boolean.parseBoolean(split[5]), 4));
                    } catch (NumberFormatException | UnknownHostException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DnsCacheEntrySerializable/parseFallbackIpString/");
                        sb.append(str);
                        Log.e(sb.toString(), e);
                    }
                }
            }
        }
        try {
            A02(arrayList);
        } catch (IOException e2) {
            Log.e("FallbackManager/saveFallbacks", e2);
            AbstractC000600i abstractC000600i = this.A00;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("json=");
            sb2.append(this.A03.A0C(505));
            sb2.append("; ");
            sb2.append(e2.toString());
            abstractC000600i.A09("fallback-manager/save-error", sb2.toString(), false);
        }
    }
}
