package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Set;
import org.npci.commonlibrary.NPCIFragment;

/* renamed from: X.4BF  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4BF implements Runnable {
    public final /* synthetic */ NPCIFragment A00;

    public C4BF(NPCIFragment nPCIFragment) {
        this.A00 = nPCIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        NPCIFragment nPCIFragment = this.A00;
        int i = nPCIFragment.A00;
        if (i != -1) {
            ArrayList arrayList = nPCIFragment.A0C;
            if (arrayList.get(i) instanceof C4GH) {
                final C4GH c4gh = (C4GH) arrayList.get(i);
                c4gh.A02(false);
                c4gh.AVc(nPCIFragment.A0B.A06(R.string.npci_action_resend), C02160Ac.A03(nPCIFragment.A09(), R.drawable.ic_action_reload), new View.OnClickListener() { // from class: X.4BE
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        String str;
                        NPCIFragment nPCIFragment2 = C4BF.this.A00;
                        nPCIFragment2.A11(c4gh);
                        Intent intent = new Intent("TRIGGER_OTP");
                        C14030mF A00 = C14030mF.A00(nPCIFragment2.A0a());
                        synchronized (A00.A04) {
                            String action = intent.getAction();
                            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(A00.A00.getContentResolver());
                            Uri data = intent.getData();
                            String scheme = intent.getScheme();
                            Set<String> categories = intent.getCategories();
                            boolean z = false;
                            if ((intent.getFlags() & 8) != 0) {
                                z = true;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Resolving type ");
                                sb.append(resolveTypeIfNeeded);
                                sb.append(" scheme ");
                                sb.append(scheme);
                                sb.append(" of intent ");
                                sb.append(intent);
                                Log.v("LocalBroadcastManager", sb.toString());
                            }
                            ArrayList arrayList2 = (ArrayList) A00.A03.get(intent.getAction());
                            if (arrayList2 != null) {
                                if (z) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Action list: ");
                                    sb2.append(arrayList2);
                                    Log.v("LocalBroadcastManager", sb2.toString());
                                }
                                ArrayList arrayList3 = null;
                                int i2 = 0;
                                while (i2 < arrayList2.size()) {
                                    C14020mE c14020mE = (C14020mE) arrayList2.get(i2);
                                    if (z) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Matching against filter ");
                                        sb3.append(c14020mE.A03);
                                        Log.v("LocalBroadcastManager", sb3.toString());
                                    }
                                    if (!c14020mE.A00) {
                                        str = resolveTypeIfNeeded;
                                        int match = c14020mE.A03.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                        if (match >= 0) {
                                            if (z) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append("  Filter matched!  match=0x");
                                                sb4.append(Integer.toHexString(match));
                                                Log.v("LocalBroadcastManager", sb4.toString());
                                            }
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(c14020mE);
                                            c14020mE.A00 = true;
                                        } else if (z) {
                                            String str2 = match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category";
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append("  Filter did not match: ");
                                            sb5.append(str2);
                                            Log.v("LocalBroadcastManager", sb5.toString());
                                        }
                                    } else {
                                        if (z) {
                                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                                        }
                                        str = resolveTypeIfNeeded;
                                    }
                                    i2++;
                                    resolveTypeIfNeeded = str;
                                }
                                if (arrayList3 != null) {
                                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                        ((C14020mE) arrayList3.get(i3)).A00 = false;
                                    }
                                    A00.A02.add(new C14010mD(intent, arrayList3));
                                    Handler handler = A00.A01;
                                    if (!handler.hasMessages(1)) {
                                        handler.sendEmptyMessage(1);
                                    }
                                }
                            }
                        }
                    }
                }, 0, true, true);
            }
        }
    }
}
