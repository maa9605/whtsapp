package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1vU */
/* loaded from: classes2.dex */
public class C42281vU {
    public final C012005w A00;
    public final AnonymousClass034 A01;
    public final C41181tV A02;
    public final C05M A03;
    public final C0C9 A04;
    public final C42321vY A05;
    public final C42271vT A06;
    public final C42301vW A07;
    public final C41961un A08;

    public C42281vU(C05M c05m, C012005w c012005w, C41181tV c41181tV, AnonymousClass034 anonymousClass034, C42301vW c42301vW, C41961un c41961un, C0C9 c0c9, C42321vY c42321vY, C42271vT c42271vT) {
        this.A03 = c05m;
        this.A00 = c012005w;
        this.A02 = c41181tV;
        this.A01 = anonymousClass034;
        this.A07 = c42301vW;
        this.A08 = c41961un;
        this.A04 = c0c9;
        this.A05 = c42321vY;
        this.A06 = c42271vT;
    }

    public static C3MP A00(InputStream inputStream) {
        try {
            JSONObject jSONObject = new JSONObject(new String(AnonymousClass088.A2D(inputStream), "UTF-8"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            C3MP c3mp = new C3MP();
            jSONObject2.getLong("creation_date");
            jSONObject2.getString("os");
            jSONObject2.getString("os_version");
            jSONObject2.getString("app_name");
            jSONObject2.getString("app_version");
            jSONObject2.getString("format_version");
            if (jSONObject.has("messages")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("messages");
                C3MR c3mr = new C3MR();
                c3mr.A00 = jSONObject3.getString("filename");
                c3mr.A01 = jSONObject3.getString("format");
                if (jSONObject3.has("chunks")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("chunks");
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                        C3MQ c3mq = new C3MQ();
                        c3mq.A00 = jSONObject4.getInt("chunk_number");
                        c3mq.A01 = jSONObject4.getInt("messages_count");
                        arrayList.add(c3mq);
                    }
                    c3mr.A02 = arrayList;
                }
                c3mp.A00 = c3mr;
            }
            return c3mp;
        } catch (IOException | JSONException e) {
            throw new IOException("Unable to parse JSON header.", e);
        }
    }

    private File A01(String str, byte b, boolean z) {
        if (str.split("/").length != 0) {
            return new File(this.A00.A0E(b, 0, z ? 1 : 2), new File(str).getName());
        }
        throw new IOException("oldFilePathStrings should not be 0 length");
    }

    public static InputStream A02(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            try {
                try {
                    for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                        if (nextEntry.getName().equalsIgnoreCase(str2)) {
                            return zipInputStream;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Failed to find entry '");
                    sb.append(str2);
                    sb.append("' in '");
                    sb.append(str);
                    sb.append("' archive.");
                    throw new FileNotFoundException(sb.toString());
                } finally {
                    try {
                        zipInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to read entry '");
                sb2.append(str2);
                sb2.append("' in '");
                sb2.append(str);
                sb2.append("' archive.");
                Log.e(sb2.toString(), e);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to read entry '");
                sb3.append(str2);
                sb3.append("' in '");
                sb3.append(str);
                sb3.append("' archive.");
                throw new IOException(sb3.toString(), e);
            }
        }
        throw new FileNotFoundException(C000200d.A0I("Unable to locate input data file '", str, "'."));
    }

    private void A03(C455222k c455222k) {
        AnonymousClass248 A01;
        AnonymousClass092 anonymousClass092;
        for (int i = 0; i < c455222k.A08.size(); i++) {
            C452821e c452821e = ((C24E) c455222k.A08.get(i)).A03;
            if (c452821e == null) {
                c452821e = C452821e.A0V;
            }
            try {
                A01 = this.A05.A01(c452821e);
            } catch (C22W e) {
                Log.e("Failed to parse message from WMI.", e);
            }
            if (A01 != null && (anonymousClass092 = A01.A00) != null) {
                A04(anonymousClass092);
            }
            Log.e("Parsed WMI message is null.");
        }
    }

    private void A04(AnonymousClass092 anonymousClass092) {
        AnonymousClass097 anonymousClass097;
        C09H c09h;
        File file;
        try {
            if ((anonymousClass092 instanceof AnonymousClass097) && (c09h = (anonymousClass097 = (AnonymousClass097) anonymousClass092).A02) != null && (file = c09h.A0F) != null) {
                String A07 = this.A01.A07(file);
                File A01 = A01(A07, anonymousClass092.A0m, anonymousClass092.A0n.A02);
                this.A06.A07(A07, A01, new byte[4096], new CancellationSignal());
                c09h.A0F = A01;
                c09h.A0P = true;
                if (anonymousClass097 instanceof AnonymousClass095) {
                    C03900Hp A0E = anonymousClass097.A0E();
                    if (A0E.A07() == null) {
                        try {
                            Bitmap A0Z = this.A08.A0Z(Uri.fromFile(c09h.A0F), 100, 100);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            A0Z.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            A0Z.recycle();
                            A0E.A03(byteArray);
                        } catch (C42671w8 e) {
                            Log.e("Failed to generate media thumbnail.", e);
                        }
                    }
                }
            }
            this.A04.A0R(anonymousClass092);
        } catch (IOException e2) {
            Log.e("Failed to insert message.", e2);
        }
    }

    private void A05(InputStream inputStream, C3MR c3mr, CancellationSignal cancellationSignal) {
        List<C3MQ> list = c3mr.A02;
        if (list != null) {
            long j = 0;
            for (C3MQ c3mq : list) {
                j += c3mq.A01;
            }
            int i = 0;
            long j2 = 0;
            while (true) {
                try {
                    C454722f c454722f = (C454722f) C0AZ.A02(C454722f.A08, inputStream);
                    if (c454722f != null) {
                        if (c3mr.A02.size() > i) {
                            C3MQ c3mq2 = (C3MQ) c3mr.A02.get(i);
                            int i2 = c3mq2.A00;
                            for (int i3 = 0; i3 < c454722f.A05.size(); i3++) {
                                C455222k c455222k = (C455222k) c454722f.A05.get(i3);
                                AbstractC005302j A02 = AbstractC005302j.A02(c455222k.A09);
                                if (A02 != null) {
                                    if (this.A03.A07(A02) == null) {
                                        C41181tV c41181tV = this.A02;
                                        c41181tV.A05.A01(new RunnableEBaseShape0S1300000_I0(c41181tV, A02, c455222k.A0A, C3MO.A00, 3), 6);
                                    }
                                    A03(c455222k);
                                }
                                j2 += c3mq2.A01;
                                long j3 = (100 * j2) / j;
                                C42301vW c42301vW = this.A07;
                                synchronized (c42301vW.A00) {
                                    Iterator it = c42301vW.A00.iterator();
                                    while (true) {
                                        C0G5 c0g5 = (C0G5) it;
                                        if (!c0g5.hasNext()) {
                                            break;
                                        }
                                        ((C3MS) c0g5.next()).ANP(0L, j);
                                    }
                                }
                            }
                            i++;
                        } else {
                            StringBuilder A0Q = C000200d.A0Q("There are no message chunk info for chunk with index '", i, "' for deserialized messages data (total '");
                            A0Q.append(c3mr.A02.size());
                            A0Q.append("' chunks).");
                            Log.e(A0Q.toString());
                            StringBuilder A0Q2 = C000200d.A0Q("There are no message chunk info for chunk with index '", i, "' for deserialized messages data (total '");
                            A0Q2.append(c3mr.A02.size());
                            A0Q2.append("' chunks).");
                            throw new IOException(A0Q2.toString());
                        }
                    } else {
                        C42301vW c42301vW2 = this.A07;
                        synchronized (c42301vW2.A00) {
                            Iterator it2 = c42301vW2.A00.iterator();
                            while (true) {
                                C0G5 c0g52 = (C0G5) it2;
                                if (c0g52.hasNext()) {
                                    ((C3MS) c0g52.next()).AIk();
                                }
                            }
                        }
                        return;
                    }
                } catch (IOException e) {
                    Log.e("Failed to parse serialized messages file.", e);
                    throw new IOException("Failed to parse serialized messages file.", e);
                }
            }
        } else {
            Log.e("Messages chunks are not specified.");
            throw new IOException("Messages chunks are not specified.");
        }
    }

    public void A06(CancellationSignal cancellationSignal) {
        A07(this.A06.A01("migration/messages_export.zip"), cancellationSignal);
    }

    public void A07(File file, CancellationSignal cancellationSignal) {
        String absolutePath = file.getAbsolutePath();
        try {
            InputStream A02 = A02(absolutePath, "header.json");
            C3MP A00 = A00(A02);
            A02.close();
            C3MR c3mr = A00.A00;
            if (c3mr == null || TextUtils.isEmpty(c3mr.A00) || !"protobuf".equalsIgnoreCase(c3mr.A01)) {
                return;
            }
            try {
                InputStream A022 = A02(absolutePath, c3mr.A00);
                A05(A022, c3mr, cancellationSignal);
                A022.close();
            } catch (IOException e) {
                throw new IOException("Unable to process messages file in messages archive.", e);
            }
        } catch (IOException e2) {
            throw new IOException("Unable to locate header metadata file in messages archive.", e2);
        }
    }
}
