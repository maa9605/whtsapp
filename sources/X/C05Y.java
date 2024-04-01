package X;

import android.os.ConditionVariable;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.05Y */
/* loaded from: classes.dex */
public class C05Y {
    public static volatile C05Y A09;
    public C0OX A00;
    public C0KS A01;
    public final C010005b A02;
    public final C010605h A03;
    public final C009905a A04;
    public final C010105c A05;
    public final C05Z A06;
    public final C010205d A07;
    public final AtomicInteger A08 = new AtomicInteger();

    public C05Y(C05Z c05z, C009905a c009905a, C010005b c010005b, C010105c c010105c, C010205d c010205d, C010605h c010605h) {
        this.A06 = c05z;
        this.A04 = c009905a;
        this.A02 = c010005b;
        this.A05 = c010105c;
        this.A07 = c010205d;
        this.A03 = c010605h;
    }

    public static Message A00(int i, String str, C02590Ca c02590Ca, boolean z, boolean z2) {
        Message obtain = Message.obtain(null, 0, 233, i, c02590Ca);
        obtain.getData().putString("messageClient:iqId", str);
        obtain.getData().putBoolean("messageClient:dropIfOffline", z);
        obtain.getData().putBoolean("messageClient:checkCallback", z2);
        return obtain;
    }

    public static C05Y A01() {
        if (A09 == null) {
            synchronized (C05Y.class) {
                if (A09 == null) {
                    A09 = new C05Y(C05Z.A01, C009905a.A02, C010005b.A07, C010105c.A00(), C010205d.A00(), C010605h.A03);
                }
            }
        }
        return A09;
    }

    public String A02() {
        String obj;
        C010205d c010205d = this.A07;
        synchronized (c010205d.A08) {
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            int i = c010205d.A00;
            c010205d.A00 = i + 1;
            sb.append(Integer.toHexString(i));
            obj = sb.toString();
            C000700j.A07(c010205d.A0B.put(obj, c010205d.A07) == null);
            if (c010205d.A00 == 65536) {
                c010205d.A02.A09("iqId too large", null, false);
                c010205d.A00 = 0;
            }
        }
        return obj;
    }

    public String A03() {
        StringBuilder A0P = C000200d.A0P("n");
        A0P.append(Integer.toHexString(this.A08.getAndIncrement()));
        return A0P.toString();
    }

    public Future A04(C04420Kc c04420Kc, Message message) {
        C1Q5 c1q5;
        C04420Kc c04420Kc2 = c04420Kc;
        C000700j.A04(c04420Kc2, "MessageClient/sendAckableMessage: stanzaKey is null");
        Jid jid = c04420Kc2.A01;
        if ((jid instanceof DeviceJid) && jid.getDevice() == 0) {
            c1q5 = c04420Kc2.A02();
            c1q5.A00 = ((DeviceJid) jid).userJid;
        } else {
            c1q5 = null;
        }
        DeviceJid of = DeviceJid.of(c04420Kc2.A02);
        if (of != null && of.device == 0) {
            if (c1q5 == null) {
                c1q5 = c04420Kc2.A02();
            }
            c1q5.A01 = of.userJid;
        }
        if (c1q5 != null) {
            Map map = c1q5.A08;
            c04420Kc2 = new C04420Kc(c1q5.A00, c1q5.A04, c1q5.A06, c1q5.A07, c1q5.A03, c1q5.A01, c1q5.A02, c1q5.A05, 0L, map.isEmpty() ? null : new ArrayList(map.values()));
        }
        C0Ml c0Ml = new C0Ml();
        C010105c c010105c = this.A05;
        Map map2 = c010105c.A02;
        synchronized (map2) {
            if (map2.containsKey(c04420Kc2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("added duplicate ackable stanza: ");
                sb.append(c04420Kc2);
                Log.e(sb.toString());
                c010105c.A01.A09("MessageCallbacksManager/addAckCallback", "duplicate_ackable_stanza", true);
            }
            map2.put(c04420Kc2, c0Ml);
        }
        A09(message);
        return c0Ml;
    }

    public Future A05(String str, Message message, boolean z) {
        boolean containsKey;
        C000700j.A04(str, "MessageClient/sendIq: id is null");
        if (z) {
            Map map = this.A05.A03;
            synchronized (map) {
                containsKey = map.containsKey(str);
            }
            if (containsKey) {
                this.A07.A03(str);
                throw new Exception(C000200d.A0H("MessageClient/sendIq: duplicate id: ", str)) { // from class: X.0S4
                };
            }
        }
        C0Ml c0Ml = new C0Ml();
        Map map2 = this.A05.A03;
        synchronized (map2) {
            map2.put(str, c0Ml);
        }
        A09(message);
        this.A07.A03(str);
        return c0Ml;
    }

    public void A06(int i, String str, C02590Ca c02590Ca, InterfaceC010405f interfaceC010405f, long j) {
        C010005b c010005b = this.A02;
        if (c010005b.A06 && c010005b.A02) {
            this.A07.A04(str, interfaceC010405f, j, false);
            A09(A00(i, str, c02590Ca, true, j > 0));
            return;
        }
        this.A07.A03(str);
        StringBuilder sb = new StringBuilder("MessageClient/sendIqWithCallback ready:");
        sb.append(c010005b.A06);
        sb.append(" connected:");
        sb.append(c010005b.A02);
        sb.append(" iqId=");
        sb.append(str);
        Log.i(sb.toString());
        interfaceC010405f.AJI(str);
    }

    public void A07(int i, String str, C02590Ca c02590Ca, InterfaceC010405f interfaceC010405f, long j) {
        if (A0B(i, str, c02590Ca, interfaceC010405f, j)) {
            return;
        }
        StringBuilder sb = new StringBuilder("MessageClient/sendIqWithCallback/add-to-pending type: ");
        sb.append(i);
        sb.append(" id: ");
        sb.append(str);
        Log.i(sb.toString());
        this.A07.A04(str, interfaceC010405f, j, true);
        this.A04.A02(str, A00(i, str, c02590Ca, false, j > 0), false);
    }

    public void A08(long j) {
        ConditionVariable conditionVariable;
        C000700j.A00();
        C010605h c010605h = this.A03;
        if (!c010605h.A03()) {
            if (this.A00 != null) {
                Log.i("app/msghandler-not-connected/connecting-now");
                this.A00.ARB();
            } else {
                Log.i("app/msghandler-not-connected/too-early-to-connect");
            }
            Log.i("app/waiting-for-msghandler-to-be-connected");
            if (c010605h != null) {
                C000700j.A00();
                synchronized (c010605h.A02) {
                    conditionVariable = c010605h.A01;
                }
                if (!conditionVariable.block(j)) {
                    Log.i("gdrive-service/backup-map/timeout-while-waiting-for-msghandler-to-be-connected/abort");
                    throw new Exception() { // from class: X.1PZ
                    };
                }
            } else {
                throw null;
            }
        }
        Log.i("app/msghandler-connected/true");
    }

    public void A09(Message message) {
        C000700j.A04(this.A01, "sendXmpp called before sending channel is ready");
        StringBuilder sb = new StringBuilder("MessageClient/sendXmpp; type=");
        int i = message.arg1;
        if (i == 233) {
            i = message.arg2;
        }
        C000200d.A1F(sb, i);
        int i2 = message.arg1;
        if (i2 == 233) {
            i2 = message.arg2;
        }
        switch (i2) {
            case 2:
            case 4:
            case 8:
            case 12:
            case 14:
            case 15:
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
            case 17:
            case 19:
            case C0M6.A01 /* 20 */:
            case 22:
            case 25:
            case 26:
            case 27:
            case 30:
            case 35:
            case 38:
            case 43:
            case 59:
            case 60:
            case 69:
            case 70:
            case 71:
            case C0M6.A02 /* 72 */:
            case 73:
            case 77:
            case 81:
            case 82:
            case 83:
            case 84:
            case 89:
            case 91:
            case 92:
            case 93:
            case 98:
            case 99:
            case C42311vX.A0A /* 100 */:
            case 101:
            case 105:
            case 106:
            case 107:
            case C0M6.A03 /* 108 */:
            case 112:
            case 115:
            case 118:
            case 119:
            case 120:
            case 121:
            case 123:
            case 124:
            case 125:
            case 126:
            case 134:
            case 153:
            case 157:
            case 158:
            case 166:
            case 167:
            case 168:
            case 169:
            case 171:
            case 172:
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /* 176 */:
            case 177:
            case 180:
            case 183:
            case 184:
            case 188:
            case 189:
            case 191:
            case 193:
            case 194:
            case 198:
            case 206:
            case 207:
            case 208:
            case 209:
            case 211:
            case 220:
            case 222:
            case 234:
            case 249:
            case 254:
            case 255:
            case 260:
            case 261:
            case 264:
            case 270:
            case 271:
            case 273:
                C0OX c0ox = this.A00;
                if (c0ox == null) {
                    throw null;
                }
                c0ox.ARB();
                break;
        }
        this.A01.ASc(Message.obtain(message));
    }

    public final void A0A(Message message, String str, boolean z) {
        int i = message.arg1;
        if (i == 233) {
            i = message.arg2;
        }
        if (this.A02.A06) {
            if (z) {
                C05Z c05z = this.A06;
                if (str == null) {
                    throw null;
                }
                if (c05z != null) {
                    LinkedHashMap linkedHashMap = c05z.A00;
                    synchronized (linkedHashMap) {
                        linkedHashMap.put(str, Pair.create(message, Integer.valueOf(linkedHashMap.containsKey(str) ? 1 + ((Integer) ((Pair) linkedHashMap.get(str)).second).intValue() : 1)));
                    }
                } else {
                    throw null;
                }
            }
            A09(message);
            return;
        }
        StringBuilder sb = new StringBuilder("MessageClient/sendMessageWhenReady/add-to-pending type: ");
        sb.append(i);
        sb.append(" id: ");
        sb.append(str);
        Log.i(sb.toString());
        this.A04.A02(str, message, z);
    }

    public boolean A0B(int i, String str, C02590Ca c02590Ca, InterfaceC010405f interfaceC010405f, long j) {
        if (this.A02.A06) {
            this.A07.A04(str, interfaceC010405f, j, false);
            A09(A00(i, str, c02590Ca, false, j > 0));
            return true;
        }
        this.A07.A03(str);
        StringBuilder sb = new StringBuilder("MessageClient/sendIqWithCallback not ready, iqId=");
        sb.append(str);
        Log.i(sb.toString());
        return false;
    }

    public boolean A0C(Message message) {
        if (this.A02.A06) {
            A09(message);
            return true;
        }
        return false;
    }
}
