package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Bd  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Bd {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public Messenger A01;
    public C1CO A02;
    public final Context A03;
    public final C006802z A04 = new C006802z();
    public final C0BY A05;

    public C0Bd(Context context, C0BY c0by) {
        this.A03 = context;
        this.A05 = c0by;
        final Looper mainLooper = Looper.getMainLooper();
        this.A00 = new Messenger(new HandlerC02410Bf(mainLooper) { // from class: X.0Be
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C0Bd c0Bd = C0Bd.this;
                if (c0Bd != null) {
                    if (message != null) {
                        Object obj = message.obj;
                        if (obj instanceof Intent) {
                            Intent intent = (Intent) obj;
                            intent.setExtrasClassLoader(new ClassLoader() { // from class: X.1CN
                                @Override // java.lang.ClassLoader
                                public final Class loadClass(String str, boolean z) {
                                    if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
                                        if (FirebaseInstanceId.A03()) {
                                            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
                                            return C1CO.class;
                                        }
                                        return C1CO.class;
                                    }
                                    return super.loadClass(str, z);
                                }
                            });
                            if (intent.hasExtra("google.messenger")) {
                                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                                if (parcelableExtra instanceof C1CO) {
                                    c0Bd.A02 = (C1CO) parcelableExtra;
                                }
                                if (parcelableExtra instanceof Messenger) {
                                    c0Bd.A01 = (Messenger) parcelableExtra;
                                }
                            }
                            Intent intent2 = (Intent) message.obj;
                            String action = intent2.getAction();
                            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                    String valueOf = String.valueOf(action);
                                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                                    return;
                                }
                                return;
                            }
                            String stringExtra = intent2.getStringExtra("registration_id");
                            if (stringExtra == null) {
                                stringExtra = intent2.getStringExtra("unregistered");
                            }
                            if (stringExtra == null) {
                                String stringExtra2 = intent2.getStringExtra("error");
                                if (stringExtra2 == null) {
                                    String valueOf2 = String.valueOf(intent2.getExtras());
                                    StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                                    sb.append("Unexpected response, no error or registration id ");
                                    sb.append(valueOf2);
                                    Log.w("FirebaseInstanceId", sb.toString());
                                    return;
                                }
                                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                    Log.d("FirebaseInstanceId", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                                }
                                if (stringExtra2.startsWith("|")) {
                                    String[] split = stringExtra2.split("\\|");
                                    if (split.length <= 2 || !"ID".equals(split[1])) {
                                        Log.w("FirebaseInstanceId", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                        return;
                                    }
                                    String str = split[2];
                                    String str2 = split[3];
                                    if (str2.startsWith(":")) {
                                        str2 = str2.substring(1);
                                    }
                                    c0Bd.A01(str, intent2.putExtra("error", str2).getExtras());
                                    return;
                                }
                                C006802z c006802z = c0Bd.A04;
                                synchronized (c006802z) {
                                    for (int i = 0; i < c006802z.A00; i++) {
                                        c0Bd.A01((String) c006802z.A02[i << 1], intent2.getExtras());
                                    }
                                }
                                return;
                            }
                            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                            if (!matcher.matches()) {
                                if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                                    return;
                                }
                                Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                                return;
                            }
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            c0Bd.A01(group, extras);
                            return;
                        }
                    }
                    Log.w("FirebaseInstanceId", "Dropping invalid message");
                    return;
                }
                throw null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle A00(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Bd.A00(android.os.Bundle):android.os.Bundle");
    }

    public final void A01(String str, Bundle bundle) {
        C006802z c006802z = this.A04;
        synchronized (c006802z) {
            C0NR c0nr = (C0NR) c006802z.remove(str);
            if (c0nr == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            c0nr.A00.A09(bundle);
        }
    }
}
