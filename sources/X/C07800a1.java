package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0a1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07800a1 {
    public static List A00;

    public static void A00(final Activity activity, final AnonymousClass012 anonymousClass012, final C02L c02l, C05M c05m, C41181tV c41181tV, C0E6 c0e6, C05W c05w, C0C9 c0c9, C02F c02f, C26S c26s) {
        if (c02f.A02("android.permission.NFC") == 0) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
            if (defaultAdapter != null) {
                try {
                    defaultAdapter.setNdefPushMessageCallback(new NfcAdapter.CreateNdefMessageCallback() { // from class: X.1I6
                        @Override // android.nfc.NfcAdapter.CreateNdefMessageCallback
                        public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
                            UserJid userJid;
                            C02L c02l2 = C02L.this;
                            Activity activity2 = activity;
                            AnonymousClass012 anonymousClass0122 = anonymousClass012;
                            Log.i("newchatnfc/createndef");
                            NdefRecord[] ndefRecordArr = new NdefRecord[2];
                            byte[] bytes = "application/com.whatsapp.chat".getBytes(Charset.forName("US-ASCII"));
                            c02l2.A05();
                            UserJid userJid2 = c02l2.A03;
                            if (userJid2 != null) {
                                byte[] bytes2 = userJid2.getRawString().getBytes(Charset.forName("US-ASCII"));
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    c02l2.A05();
                                    userJid = c02l2.A03;
                                } catch (JSONException e) {
                                    Log.e("newchatnfc/", e);
                                }
                                if (userJid != null) {
                                    jSONObject.put("jid", userJid.getRawString());
                                    String A02 = C05V.A02(anonymousClass0122, c02l2, false);
                                    jSONObject.put("id", A02);
                                    jSONObject.put("name", c02l2.A02());
                                    synchronized (C07800a1.class) {
                                        if (C07800a1.A00 == null) {
                                            C07800a1.A01(activity2);
                                        }
                                        C07800a1.A00.add(0, A02);
                                        if (C07800a1.A00.size() > 16) {
                                            List list = C07800a1.A00;
                                            list.remove(list.size() - 1);
                                        }
                                        C07800a1.A02(activity2);
                                    }
                                    ndefRecordArr[0] = new NdefRecord((short) 2, bytes, bytes2, jSONObject.toString().getBytes(Charset.forName("US-ASCII")));
                                    ndefRecordArr[1] = NdefRecord.createApplicationRecord("com.whatsapp");
                                    return new NdefMessage(ndefRecordArr);
                                }
                                throw null;
                            }
                            throw null;
                        }
                    }, activity, new Activity[0]);
                } catch (IllegalStateException | SecurityException e) {
                    Log.i("newchatnfc/ ", e);
                }
            }
            if ("android.nfc.action.NDEF_DISCOVERED".equals(activity.getIntent().getAction())) {
                A03(activity, anonymousClass012, c02l, c05m, c41181tV, c0e6, c05w, c0c9, c26s, activity.getIntent());
            }
        }
    }

    public static synchronized void A01(Context context) {
        synchronized (C07800a1.class) {
            A00 = new ArrayList();
            File file = new File(context.getFilesDir(), "nfc_ids");
            if (file.exists()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            A00.add(readLine);
                        } finally {
                        }
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("newchatnfc/cannot read ids ");
                    sb.append(file.getAbsolutePath());
                    Log.i(sb.toString(), e);
                }
            }
        }
    }

    public static synchronized void A02(Context context) {
        synchronized (C07800a1.class) {
            if (A00 == null) {
                return;
            }
            File file = new File(context.getFilesDir(), "nfc_ids");
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                try {
                    for (String str : A00) {
                        bufferedWriter.write(str);
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                } finally {
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("newchatnfc/cannot write ids ");
                sb.append(file.getAbsolutePath());
                Log.i(sb.toString(), e);
            }
        }
    }

    public static void A03(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C05M c05m, C41181tV c41181tV, C0E6 c0e6, C05W c05w, final C0C9 c0c9, C26S c26s, Intent intent) {
        String str;
        String str2;
        String str3;
        final AbstractC005302j A02;
        JSONObject jSONObject;
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            Log.i("newchatnfc/processnfcintent");
            NdefMessage ndefMessage = (NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
            if ("application/com.whatsapp.chat".equals(new String(ndefMessage.getRecords()[0].getType(), Charset.forName("US-ASCII")))) {
                try {
                    jSONObject = new JSONObject(new String(ndefMessage.getRecords()[0].getPayload(), Charset.forName("US-ASCII")));
                    str = jSONObject.getString("jid");
                    try {
                        str2 = jSONObject.getString("id");
                    } catch (JSONException e) {
                        e = e;
                        str2 = null;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    str = null;
                    str2 = null;
                }
                try {
                    str3 = jSONObject.getString("name");
                } catch (JSONException e3) {
                    e = e3;
                    Log.e("newchatnfc/processnfcintent", e);
                    str3 = null;
                    A02 = AbstractC005302j.A02(str);
                    if (A02 == null) {
                    }
                    StringBuilder A0P = C000200d.A0P("newchatnfc/processnfcintent jid is invalid:");
                    A0P.append(C003101m.A07(A02));
                    A0P.append(" id:");
                    A0P.append(str2);
                    Log.i(A0P.toString());
                }
                A02 = AbstractC005302j.A02(str);
                if (A02 == null && str2 != null) {
                    if (!c05m.A0E(A02)) {
                        C06C A09 = c05w.A09(A02);
                        if (A09 != null && A09.A08 != null) {
                            str3 = null;
                        }
                        c41181tV.A05.A01(new RunnableEBaseShape0S1300000_I0(c41181tV, A02, str3, new Runnable() { // from class: X.1I5
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0C9.this.A0g(A02, null);
                            }
                        }, 3), 6);
                    }
                    C40541sR A092 = C40531sQ.A09();
                    C2FN c2fn = (C2FN) ((C40531sQ) A092.A00).A0m().AVX();
                    String A022 = c02l.A02();
                    c2fn.A02();
                    C2FO.A09((C2FO) c2fn.A00, A022);
                    c2fn.A02();
                    C2FO.A0A((C2FO) c2fn.A00, str2);
                    A092.A02();
                    C40531sQ.A0F((C40531sQ) A092.A00, c2fn);
                    long A05 = anonymousClass012.A05();
                    String A023 = C05V.A02(anonymousClass012, c02l, false);
                    C40531sQ c40531sQ = (C40531sQ) A092.A01();
                    Set emptySet = Collections.emptySet();
                    if (emptySet == null) {
                        throw null;
                    }
                    if (c26s != null) {
                        c0e6.A00.A01(new SendE2EMessageJob(c40531sQ, A023, A02, null, null, emptySet, 0, false, anonymousClass012.A04(), null, null, null, null, false, A05 + 86400000, 0L, 0, 0, null, false, false, null, null, c26s));
                        Intent A024 = Conversation.A02(context, A02);
                        C002701i.A1C(A024, "NewChatNfc:processNfcIntent", anonymousClass012);
                        context.startActivity(A024);
                        return;
                    }
                    throw null;
                }
                StringBuilder A0P2 = C000200d.A0P("newchatnfc/processnfcintent jid is invalid:");
                A0P2.append(C003101m.A07(A02));
                A0P2.append(" id:");
                A0P2.append(str2);
                Log.i(A0P2.toString());
            }
        }
    }
}
