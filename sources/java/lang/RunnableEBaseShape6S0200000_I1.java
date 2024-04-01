package java.lang;

import X.AbstractC005302j;
import X.AbstractC52172aB;
import X.AnonymousClass009;
import X.C000700j;
import X.C002301c;
import X.C06C;
import X.C0G5;
import X.C0HK;
import X.C0M6;
import X.C0MA;
import X.C1D4;
import X.C1D8;
import X.C1D9;
import X.C27791Ou;
import X.C29K;
import X.C2AY;
import X.C2KK;
import X.C2L3;
import X.C2OS;
import X.C2OU;
import X.C33161fS;
import X.C33181fU;
import X.C33191fV;
import X.C3YG;
import X.C40711sk;
import X.C42371vd;
import X.C468628o;
import X.C49382Kc;
import X.C49452Kn;
import X.C73453bf;
import X.C78823ka;
import X.C79503ll;
import X.C79523ln;
import X.C79573ls;
import X.C82883rE;
import X.C83113rb;
import X.C83243ro;
import X.C84453tl;
import X.C85943wX;
import X.C86533xi;
import X.InterfaceC41531u4;
import X.RunnableC51182Uw;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.picker.search.GifSearchDialogFragment;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLogActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.wawebrtc.MediaCodecVideoDecoder;

/* loaded from: classes2.dex */
public class RunnableEBaseShape6S0200000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape6S0200000_I1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C49382Kc c49382Kc;
        C33191fV c33191fV;
        C1D9 A00;
        UserJid userJid;
        switch (this.A02) {
            case 0:
                ((AnonymousClass009) this.A01).A00(this.A00);
                return;
            case 1:
                ((AnonymousClass009) this.A01).A00(this.A00);
                return;
            case 2:
                C49452Kn c49452Kn = (C49452Kn) this.A00;
                C468628o c468628o = (C468628o) this.A01;
                try {
                    C2KK c2kk = c49452Kn.A07;
                    UserJid userJid2 = c49452Kn.A09;
                    String str = c468628o.A09;
                    C49382Kc A04 = c2kk.A04(userJid2, str);
                    if (A04 == null) {
                        c49382Kc = new C49382Kc(c468628o);
                    } else {
                        long j = A04.A00;
                        if (j < 99) {
                            c49382Kc = new C49382Kc(c468628o, j + 1);
                        } else {
                            C0HK c0hk = c49452Kn.A03;
                            if (c0hk != null) {
                                c0hk.A0A(Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                    }
                    c2kk.A08(userJid2, c49382Kc);
                    c49452Kn.A08.A03(28, 49, str, userJid2, Long.valueOf(c49382Kc.A00), null, null, null, null);
                    C0HK c0hk2 = c49452Kn.A04;
                    if (c0hk2 != null) {
                        c0hk2.A0A(Boolean.TRUE);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    C0HK c0hk3 = c49452Kn.A02;
                    if (c0hk3 != null) {
                        c0hk3.A0A(Boolean.TRUE);
                        return;
                    }
                    return;
                }
            case 3:
                ((C2L3) this.A01).A0E.remove(this.A00);
                return;
            case 4:
                ((C2L3) this.A01).A0E.remove(this.A00);
                return;
            case 5:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                C42371vd c42371vd = contactPickerFragment.A0V;
                UserJid userJid3 = ((C29K) this.A01).A07;
                c42371vd.A02(new C0MA(userJid3, contactPickerFragment.A1d(userJid3) ? "ctwa" : "click_to_chat_link", null));
                return;
            case 6:
                DeviceJid deviceJid = (DeviceJid) this.A01;
                C2AY c2ay = ((RunnableC51182Uw) ((RunnableEBaseShape0S0110000_I0) this.A00).A00).A02.A05;
                C000700j.A01();
                Iterator it = c2ay.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (!c0g5.hasNext()) {
                        return;
                    }
                    ((InterfaceC41531u4) c0g5.next()).AHg(deviceJid);
                }
            case 7:
                ((C2OS) this.A01).AMs();
                ((C2OU) this.A00).A00.A03();
                return;
            case 8:
                C78823ka c78823ka = (C78823ka) this.A00;
                CharSequence charSequence = (CharSequence) this.A01;
                c78823ka.A00 = null;
                String charSequence2 = charSequence.toString();
                GifSearchDialogFragment gifSearchDialogFragment = c78823ka.A02;
                if (charSequence2.equals(gifSearchDialogFragment.A0D)) {
                    return;
                }
                GifSearchDialogFragment.A00(gifSearchDialogFragment, charSequence);
                return;
            case 9:
                ((C85943wX) this.A00).A08.ANU((C1D9) this.A01);
                return;
            case 10:
                C85943wX c85943wX = (C85943wX) this.A00;
                byte[] bArr = (byte[]) this.A01;
                Camera.Size size = c85943wX.A02;
                int i = size.width;
                int i2 = (i * 3) >> 2;
                if (i2 < 320) {
                    i2 = i;
                }
                int i3 = size.height;
                int i4 = (i3 * 3) >> 2;
                if (i4 < 320) {
                    i4 = i3;
                }
                C1D4 c1d4 = new C1D4(new C33181fU(new C33161fS(bArr, i, i3, (i - i2) >> 1, (i3 - i4) >> 1, i2, i4)));
                try {
                    c33191fV = c85943wX.A0I;
                    A00 = c33191fV.A00(c1d4, c85943wX.A0A);
                } catch (C1D8 unused2) {
                    if (c85943wX.A0I == null) {
                        throw null;
                    }
                } catch (Throwable th) {
                    if (c85943wX.A0I == null) {
                        throw null;
                    }
                    throw th;
                }
                if (c33191fV != null) {
                    if (A00 != null && A00.A01 != null) {
                        if (c85943wX.A08 != null) {
                            c85943wX.A0F.post(new RunnableEBaseShape6S0200000_I1(c85943wX, A00, 9));
                            return;
                        }
                        return;
                    }
                    c85943wX.ARd();
                    return;
                }
                throw null;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C85943wX c85943wX2 = (C85943wX) this.A00;
                SurfaceHolder surfaceHolder = (SurfaceHolder) this.A01;
                try {
                    if (!surfaceHolder.isCreating()) {
                        c85943wX2.A03.stopPreview();
                    }
                    c85943wX2.A03.setPreviewDisplay(surfaceHolder);
                    c85943wX2.A04.post(new RunnableEBaseShape9S0100000_I1_1(c85943wX2, 9));
                    return;
                } catch (IOException e) {
                    c85943wX2.A03.release();
                    c85943wX2.A03 = null;
                    Log.e("qrview/surfacechanged: error setting preview display", e);
                    c85943wX2.A00();
                    return;
                } catch (RuntimeException e2) {
                    c85943wX2.A03.release();
                    c85943wX2.A03 = null;
                    Log.e("qrview/surfacechanged ", e2);
                    c85943wX2.A00();
                    return;
                }
            case 12:
                ((C79503ll) this.A00).A00.A05.ANU((C1D9) this.A01);
                return;
            case 13:
                C79523ln c79523ln = (C79523ln) this.A00;
                C06C c06c = (C06C) this.A01;
                c79523ln.A01.A0I(c06c);
                c79523ln.A04.A03(c06c);
                return;
            case 14:
                C40711sk c40711sk = (C40711sk) this.A01;
                AbstractC52172aB abstractC52172aB = ((C79573ls) this.A00).A02;
                if (abstractC52172aB.A03) {
                    return;
                }
                abstractC52172aB.A02 = c40711sk;
                int i5 = c40711sk.A01;
                if (i5 != -1 && abstractC52172aB.A04 == i5 && (userJid = c40711sk.A02) != null) {
                    C79523ln c79523ln2 = new C79523ln(abstractC52172aB.A07, abstractC52172aB.A05, abstractC52172aB.A08, abstractC52172aB.A0B, abstractC52172aB, userJid, c40711sk.A04);
                    abstractC52172aB.A01 = c79523ln2;
                    abstractC52172aB.A0C.ARy(c79523ln2, new Void[0]);
                    return;
                }
                abstractC52172aB.A02(null);
                return;
            case 15:
                C3YG c3yg = (C3YG) this.A00;
                c3yg.A01 = null;
                C82883rE c82883rE = c3yg.A03;
                String charSequence3 = ((CharSequence) this.A01).toString();
                if (charSequence3.length() > 20) {
                    c82883rE.A02.A0B(new ArrayList(0));
                    c82883rE.A00 = "";
                    return;
                }
                String replaceAll = charSequence3.replaceAll("[\\p{Punct}¥%，。？；：（）【】「」《》—¡!«»¿?{}]", "");
                if (replaceAll.equals(c82883rE.A00)) {
                    return;
                }
                c82883rE.A00 = replaceAll;
                if (replaceAll.isEmpty()) {
                    c82883rE.A02.A0B(new ArrayList(0));
                    return;
                } else {
                    c82883rE.A03.A00(replaceAll, true, true).A00(c82883rE);
                    return;
                }
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C83243ro c83243ro = (C83243ro) this.A00;
                for (C27791Ou c27791Ou : (List) this.A01) {
                    AbstractC005302j A01 = c27791Ou.A01();
                    StorageUsageGalleryActivity storageUsageGalleryActivity = c83243ro.A00;
                    if (A01.equals(storageUsageGalleryActivity.A0T)) {
                        storageUsageGalleryActivity.A03 = c27791Ou.A00.A0G;
                        storageUsageGalleryActivity.A1Q();
                        return;
                    }
                }
                return;
            case 17:
                Collection collection = (Collection) this.A01;
                Log.i("storage-usage-gallery-activity/load duplicate messages/timed out");
                StorageUsageGalleryActivity storageUsageGalleryActivity2 = ((C86533xi) this.A00).A00;
                storageUsageGalleryActivity2.A1P();
                if (storageUsageGalleryActivity2 != null) {
                    C83113rb c83113rb = new C83113rb(storageUsageGalleryActivity2);
                    StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = new StorageUsageDeleteMessagesDialogFragment();
                    storageUsageDeleteMessagesDialogFragment.A05 = collection;
                    storageUsageDeleteMessagesDialogFragment.A04 = collection;
                    storageUsageDeleteMessagesDialogFragment.A02 = c83113rb;
                    storageUsageDeleteMessagesDialogFragment.A14(storageUsageGalleryActivity2.A0N(), null);
                    return;
                }
                throw null;
            case 18:
                C73453bf c73453bf = (C73453bf) this.A00;
                View view = (View) this.A01;
                if (c73453bf.A0B == null) {
                    float[] fArr = new float[2];
                    int width = view.getWidth();
                    C002301c c002301c = c73453bf.A11;
                    fArr[0] = width * (c002301c.A0M() ? 2 : -2);
                    fArr[1] = view.getWidth() * (c002301c.A0M() ? -1 : 1);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", fArr);
                    ofFloat.setDuration(1600L);
                    ofFloat.setRepeatCount(-1);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                    ofFloat2.setDuration(1600L);
                    ofFloat2.setRepeatCount(-1);
                    AnimatorSet animatorSet = new AnimatorSet();
                    c73453bf.A0B = animatorSet;
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    c73453bf.A0B.playTogether(ofFloat, ofFloat2);
                }
                c73453bf.A0B.start();
                return;
            case 19:
                C84453tl c84453tl = (C84453tl) this.A00;
                Bitmap bitmap = (Bitmap) this.A01;
                if (bitmap != null) {
                    c84453tl.A01.A01.setImageBitmap(bitmap);
                    return;
                }
                CallLogActivity callLogActivity = c84453tl.A01;
                callLogActivity.A07.A06(callLogActivity.A01, callLogActivity.A0G);
                return;
            case C0M6.A01 /* 20 */:
                VoiceService$VoiceServiceEventCallback.lambda$callCaptureEnded$2707((Voip.RecordingInfo[]) this.A00, (Voip.DebugTapType) this.A01);
                return;
            case 21:
                try {
                    Log.i("MediaCodecVideoDecoder Java releaseDecoder on release thread");
                    MediaCodecVideoDecoder mediaCodecVideoDecoder = (MediaCodecVideoDecoder) this.A00;
                    MediaCodec mediaCodec = mediaCodecVideoDecoder.mediaCodec;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                    }
                    MediaCodec mediaCodec2 = mediaCodecVideoDecoder.mediaCodec;
                    if (mediaCodec2 != null) {
                        mediaCodec2.release();
                    }
                    Log.i("MediaCodecVideoDecoder Java releaseDecoder on release thread done");
                } catch (Exception e3) {
                    Log.e("MediaCodecVideoDecoder Media decoder release failed", e3);
                }
                ((CountDownLatch) this.A01).countDown();
                return;
            default:
                return;
        }
    }
}
