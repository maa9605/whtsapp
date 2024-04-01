package java.lang;

import X.AbstractC55962mT;
import X.AnonymousClass097;
import X.AnonymousClass272;
import X.AnonymousClass314;
import X.AnonymousClass316;
import X.AnonymousClass338;
import X.AnonymousClass387;
import X.C000700j;
import X.C008103m;
import X.C05920Qu;
import X.C0B5;
import X.C0DJ;
import X.C0G5;
import X.C0Ml;
import X.C1u5;
import X.C25L;
import X.C29y;
import X.C2L3;
import X.C2MI;
import X.C2MP;
import X.C2TZ;
import X.C34841iB;
import X.C39R;
import X.C39S;
import X.C468628o;
import X.C59952tg;
import X.C59962th;
import X.C73453bf;
import X.C78853kd;
import X.C78883kg;
import X.C84253tR;
import X.InterfaceC04750Lr;
import X.InterfaceC40241rp;
import X.InterfaceC61162vh;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* loaded from: classes2.dex */
public class RunnableEBaseShape2S0300000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape2S0300000_I1(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A01 = obj3;
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.A03) {
            case 0:
                for (InterfaceC40241rp interfaceC40241rp : (Collection) this.A01) {
                    Bitmap bitmap = (Bitmap) this.A00;
                    if (bitmap == null) {
                        ((AbstractC55962mT) this.A02).A04.ALO(interfaceC40241rp);
                    } else {
                        ((AbstractC55962mT) this.A02).A04.ALX(interfaceC40241rp, bitmap, false);
                    }
                }
                return;
            case 1:
                C59962th c59962th = (C59962th) this.A01;
                C59952tg c59952tg = (C59952tg) this.A02;
                AnonymousClass338 anonymousClass338 = (AnonymousClass338) ((C2L3) this.A00).A0G.remove(c59962th);
                if (anonymousClass338 == null) {
                    Log.e("The response handler must not be null");
                    return;
                }
                C2L3 c2l3 = anonymousClass338.A00;
                c2l3.A01 = false;
                String str = c59962th.A04;
                if (str != null && !str.equals(anonymousClass338.A02)) {
                    return;
                }
                boolean z = str != null;
                AnonymousClass272 anonymousClass272 = c2l3.A0B;
                UserJid userJid = anonymousClass338.A01;
                synchronized (anonymousClass272) {
                    C29y A01 = anonymousClass272.A01(userJid);
                    if (!z) {
                        ArrayList arrayList = A01.A03;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            anonymousClass272.A02.remove(((C468628o) it.next()).A09);
                        }
                        arrayList.clear();
                    }
                    for (C468628o c468628o : c59952tg.A01) {
                        Map map = anonymousClass272.A02;
                        String str2 = c468628o.A09;
                        if (!map.containsKey(str2)) {
                            A01.A03.add(c468628o);
                        }
                        anonymousClass272.A01.put(str2, c468628o);
                        map.put(str2, userJid);
                    }
                    A01.A01 = c59952tg.A00;
                }
                C2MP c2mp = c2l3.A0A;
                C000700j.A01();
                Iterator it2 = c2mp.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it2;
                    if (!c0g5.hasNext()) {
                        return;
                    }
                    ((InterfaceC04750Lr) c0g5.next()).AKG(userJid);
                }
                break;
            case 2:
                AnonymousClass387 anonymousClass387 = (AnonymousClass387) this.A02;
                ((WebPagePreviewView) this.A00).A01((C05920Qu) this.A01, null);
                if (anonymousClass387 != null) {
                    anonymousClass387.A01.A02(anonymousClass387.A02, anonymousClass387.A04, anonymousClass387.A00, anonymousClass387.A03);
                    return;
                }
                return;
            case 3:
                C39R c39r = (C39R) this.A00;
                C34841iB c34841iB = (C34841iB) this.A02;
                ((C0B5) this.A01).ARS();
                C39S c39s = c39r.A00;
                if (c39s != null) {
                    c39s.A01 = null;
                    c39s.A00 = null;
                    c39s.A05(true);
                    c39r.A00 = null;
                }
                c34841iB.A00();
                return;
            case 4:
                ((InterfaceC61162vh) this.A00).APF((Bitmap) this.A01, this.A02 != null);
                return;
            case 5:
                RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0 = (RunnableEBaseShape0S0310000_I0) this.A00;
                Bitmap bitmap2 = (Bitmap) this.A01;
                AnonymousClass316 anonymousClass316 = (AnonymousClass316) this.A02;
                if (runnableEBaseShape0S0310000_I0.A03) {
                    return;
                }
                MediaViewFragment mediaViewFragment = (MediaViewFragment) runnableEBaseShape0S0310000_I0.A01;
                if (mediaViewFragment.A0A().isFinishing()) {
                    return;
                }
                if (bitmap2 != null) {
                    anonymousClass316.A00.A07(new AnonymousClass314(anonymousClass316.A01, mediaViewFragment.A01(), bitmap2));
                }
                AnonymousClass097 anonymousClass097 = mediaViewFragment.A0w;
                if (anonymousClass097 == null || !anonymousClass316.A01.A0n.equals(anonymousClass097.A0n)) {
                    return;
                }
                mediaViewFragment.A1A = true;
                MediaViewFragment.A03(mediaViewFragment);
                return;
            case 6:
                CharSequence charSequence = (CharSequence) this.A01;
                View view = (View) this.A02;
                StickerSearchDialogFragment stickerSearchDialogFragment = ((C78853kd) this.A00).A01;
                stickerSearchDialogFragment.A0D = null;
                if (charSequence.toString().equals(stickerSearchDialogFragment.A0E)) {
                    return;
                }
                boolean isEmpty = TextUtils.isEmpty(charSequence);
                String charSequence2 = charSequence.toString();
                if (isEmpty) {
                    stickerSearchDialogFragment.A0E = charSequence2;
                    stickerSearchDialogFragment.A0A.A02 = null;
                    view.setVisibility(4);
                    stickerSearchDialogFragment.A0A.A02();
                    stickerSearchDialogFragment.A1A();
                    return;
                }
                C78883kg c78883kg = stickerSearchDialogFragment.A0A;
                C2MI c2mi = c78883kg.A03;
                if (c2mi.A02) {
                    c2mi.A00(charSequence2, true, false).A00(c78883kg);
                    stickerSearchDialogFragment.A00.setVisibility(8);
                    stickerSearchDialogFragment.A04.setVisibility(8);
                    if (stickerSearchDialogFragment.A03.getVisibility() != 8) {
                        stickerSearchDialogFragment.A1C(false);
                        stickerSearchDialogFragment.A03.setVisibility(8);
                    }
                }
                stickerSearchDialogFragment.A0E = charSequence2;
                return;
            case 7:
                C1u5 c1u5 = (C1u5) this.A00;
                C2TZ c2tz = (C2TZ) this.A01;
                C0Ml c0Ml = (C0Ml) this.A02;
                try {
                    c1u5.A04(c2tz, 10000L);
                    return;
                } finally {
                    c0Ml.A01(null);
                }
            case 8:
                final C84253tR c84253tR = (C84253tR) this.A00;
                View view2 = (View) this.A01;
                final View view3 = (View) this.A02;
                view2.setVisibility(8);
                if (c84253tR.A04.A0S()) {
                    return;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3tQ
                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        C73453bf c73453bf = c84253tR.A04;
                        if (c73453bf.A0S()) {
                            return;
                        }
                        view3.setVisibility(0);
                        C42401vg c42401vg = c73453bf.A1E;
                        if (c42401vg != null) {
                            Log.e("voicenote/voicenotecancelled");
                            C000700j.A01();
                            Iterator it3 = c42401vg.A00.iterator();
                            while (true) {
                                C0G5 c0g52 = (C0G5) it3;
                                if (!c0g52.hasNext()) {
                                    return;
                                }
                                ((C73363bW) c0g52.next()).A00();
                            }
                        } else {
                            throw null;
                        }
                    }
                });
                translateAnimation.setDuration(213L);
                view2.startAnimation(translateAnimation);
                return;
            case 9:
                C73453bf c73453bf = (C73453bf) this.A00;
                C008103m c008103m = (C008103m) this.A01;
                C0B5 c0b5 = (C0B5) this.A02;
                if (c73453bf.A0S()) {
                    Log.i("voicenote/startvoicenote/start");
                    C73453bf.A1R.setVolume(c73453bf.A08, 0.0f, 0.0f);
                    try {
                        c73453bf.A0d.A00.start();
                        if (!c008103m.A01()) {
                            c008103m.A01.AGI(570228737, (short) 2);
                        }
                        c73453bf.A09 = SystemClock.elapsedRealtime();
                        c73453bf.A0o.sendEmptyMessage(0);
                        return;
                    } catch (Exception e) {
                        Log.e("voicenote/startvoicenote/startfailed", e);
                        c73453bf.A0P(false, false, true);
                        if (!c008103m.A01()) {
                            c008103m.A01.AGI(570228737, (short) 3);
                        }
                        c0b5.AUj(R.string.error_setup_recorder);
                        return;
                    }
                }
                Log.i("voicenote/startvoicenote/skip");
                if (c008103m.A01()) {
                    return;
                }
                c008103m.A01.AGI(570228737, (short) 105);
                return;
            case 10:
                try {
                    try {
                        ((Exchanger) this.A01).exchange(((Callable) this.A02).call());
                        return;
                    } catch (InterruptedException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                Voip.sendRekeyRequest(C25L.A00((Jid) this.A01), ((Number) this.A02).byteValue());
                return;
            default:
                return;
        }
    }
}
