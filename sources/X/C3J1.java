package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.GifComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.3J1 */
/* loaded from: classes2.dex */
public abstract class C3J1 extends AbstractC35271is {
    public final AbstractC02800Cx A04;
    public C0D0 A01 = null;
    public C0BA A00 = null;
    public final C05I A02 = new C05I();
    public final C05I A03 = new C05I();

    public C3J1(AbstractC02800Cx abstractC02800Cx) {
        this.A04 = abstractC02800Cx;
    }

    @Override // X.C0ZT
    public Parcelable A02() {
        Bundle bundle;
        C05I c05i = this.A03;
        int i = 0;
        if (c05i.A00() > 0) {
            bundle = new Bundle();
            long[] jArr = new long[c05i.A00()];
            for (int i2 = 0; i2 < c05i.A00(); i2++) {
                long A01 = c05i.A01(i2);
                jArr[i2] = A01;
                bundle.putParcelable(Long.toString(A01), (C13630lZ) c05i.A03(i2));
            }
            bundle.putLongArray("states", jArr);
        } else {
            bundle = null;
        }
        while (true) {
            C05I c05i2 = this.A02;
            if (i >= c05i2.A00()) {
                return bundle;
            }
            C0BA c0ba = (C0BA) c05i2.A03(i);
            if (c0ba != null && c0ba.A0W()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder A0P = C000200d.A0P("f");
                A0P.append(c05i2.A01(i));
                String obj = A0P.toString();
                AbstractC02800Cx abstractC02800Cx = this.A04;
                if (abstractC02800Cx != null) {
                    if (c0ba.A0H == abstractC02800Cx) {
                        bundle.putString(obj, c0ba.A0S);
                    } else {
                        abstractC02800Cx.A0i(new IllegalStateException(C000200d.A0B(c0ba, " is not currently in the FragmentManager")));
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            i++;
        }
    }

    @Override // X.C0ZT
    public void A07(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            long[] longArray = bundle.getLongArray("states");
            C05I c05i = this.A03;
            c05i.A05();
            C05I c05i2 = this.A02;
            c05i2.A05();
            if (longArray != null) {
                for (long j : longArray) {
                    c05i.A09(j, bundle.getParcelable(Long.toString(j)));
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    C0BA A07 = this.A04.A07(bundle, str);
                    if (A07 != null) {
                        A07.A0U(false);
                        c05i2.A09(Long.parseLong(str.substring(1)), A07);
                    } else {
                        C000200d.A17("Bad fragment at key ", str, "FragmentPagerAdapter");
                    }
                }
            }
        }
    }

    @Override // X.C0ZT
    public void A08(ViewGroup viewGroup) {
        if (!(this instanceof C3LX)) {
            C0D0 c0d0 = this.A01;
            if (c0d0 != null) {
                c0d0.A08();
                this.A01 = null;
                return;
            }
            return;
        }
        C3LX c3lx = (C3LX) this;
        C0D0 c0d02 = ((C3J1) c3lx).A01;
        if (c0d02 != null) {
            c0d02.A08();
            ((C3J1) c3lx).A01 = null;
        }
        MediaComposerActivity mediaComposerActivity = c3lx.A00;
        if (mediaComposerActivity.A0d.A01() < 0 && !mediaComposerActivity.A0d.A04().isEmpty()) {
            if (mediaComposerActivity.A0d != null) {
                mediaComposerActivity.A1Y(0);
            } else {
                throw null;
            }
        }
        for (C0BA c0ba : mediaComposerActivity.A0t()) {
            if (c0ba instanceof MediaComposerFragment) {
                MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) c0ba;
                mediaComposerFragment.A13(mediaComposerActivity.A14);
                if (mediaComposerActivity.A0w && mediaComposerFragment.A00.equals(mediaComposerActivity.A8M())) {
                    mediaComposerFragment.A10();
                    mediaComposerFragment.A0z();
                }
            }
        }
    }

    @Override // X.C0ZT
    public void A09(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        StringBuilder sb = new StringBuilder("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.whatsapp.mediacomposer.ImageComposerFragment, X.0BA] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.0BA, com.whatsapp.mediacomposer.VideoComposerFragment] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.whatsapp.mediacomposer.GifComposerFragment, X.0BA] */
    @Override // X.AbstractC35271is
    public Object A0G(ViewGroup viewGroup, int i) {
        long longValue;
        StatusPlaybackContactFragment statusPlaybackContactFragment;
        StatusPlaybackContactFragment statusPlaybackContactFragment2;
        if (!(this instanceof C86863ye)) {
            C3LX c3lx = (C3LX) this;
            MediaComposerActivity mediaComposerActivity = c3lx.A00;
            Object obj = mediaComposerActivity.A1B.get(mediaComposerActivity.A0d.A04().get(c3lx.A0L(i)));
            if (obj == null) {
                throw null;
            }
            longValue = ((Number) obj).longValue();
        } else {
            C3XN c3xn = ((C86863ye) this).A00.A0D;
            Object obj2 = c3xn.A01.get(((C82003po) c3xn.A00.get(i)).A00.A0A.getRawString());
            if (obj2 == null) {
                throw null;
            }
            longValue = ((Number) obj2).longValue();
        }
        C05I c05i = this.A02;
        Object A04 = c05i.A04(longValue, null);
        StatusPlaybackContactFragment statusPlaybackContactFragment3 = A04;
        if (A04 == null) {
            if (this.A01 == null) {
                AbstractC02800Cx abstractC02800Cx = this.A04;
                if (abstractC02800Cx != null) {
                    this.A01 = new C02820Cz(abstractC02800Cx);
                } else {
                    throw null;
                }
            }
            if (!(this instanceof C86863ye)) {
                C3LX c3lx2 = (C3LX) this;
                MediaComposerActivity mediaComposerActivity2 = c3lx2.A00;
                Uri uri = (Uri) mediaComposerActivity2.A0d.A04().get(c3lx2.A0L(i));
                C41961un c41961un = mediaComposerActivity2.A0t;
                C42611w2 A01 = mediaComposerActivity2.A17.A01(uri);
                byte A0Y = c41961un.A0Y(A01);
                A01.A0A(Byte.valueOf(A0Y));
                if (A0Y == 1) {
                    ?? imageComposerFragment = new ImageComposerFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("uri", uri);
                    imageComposerFragment.A0P(bundle);
                    statusPlaybackContactFragment2 = imageComposerFragment;
                } else if (A0Y == 3) {
                    ?? videoComposerFragment = new VideoComposerFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("uri", uri);
                    videoComposerFragment.A0P(bundle2);
                    statusPlaybackContactFragment2 = videoComposerFragment;
                } else if (A0Y != 13) {
                    statusPlaybackContactFragment2 = null;
                } else {
                    ?? gifComposerFragment = new GifComposerFragment();
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("uri", uri);
                    gifComposerFragment.A0P(bundle3);
                    statusPlaybackContactFragment2 = gifComposerFragment;
                }
            } else {
                StatusPlaybackActivity statusPlaybackActivity = ((C86863ye) this).A00;
                C82003po c82003po = (C82003po) statusPlaybackActivity.A0D.A00.get(i);
                if (c82003po != null) {
                    AnonymousClass094 anonymousClass094 = statusPlaybackActivity.A0A;
                    UserJid userJid = c82003po.A00.A0A;
                    if (anonymousClass094 == null) {
                        boolean z = statusPlaybackActivity.A0L;
                        StatusPlaybackContactFragment statusPlaybackContactFragment4 = new StatusPlaybackContactFragment();
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("jid", userJid.getRawString());
                        bundle4.putBoolean("unseen_only", z);
                        statusPlaybackContactFragment4.A0P(bundle4);
                        statusPlaybackContactFragment = statusPlaybackContactFragment4;
                    } else {
                        StatusPlaybackContactFragment statusPlaybackContactFragment5 = new StatusPlaybackContactFragment();
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("jid", userJid.getRawString());
                        C0LD.A07(bundle5, anonymousClass094, "");
                        statusPlaybackContactFragment5.A0P(bundle5);
                        statusPlaybackContactFragment = statusPlaybackContactFragment5;
                    }
                    statusPlaybackContactFragment.A13(statusPlaybackActivity.A0M);
                    statusPlaybackContactFragment2 = statusPlaybackContactFragment;
                } else {
                    throw new IllegalArgumentException("Unsupported StatusItem instance");
                }
            }
            C13630lZ c13630lZ = (C13630lZ) this.A03.A04(longValue, null);
            if (c13630lZ != null) {
                if (((C0BA) statusPlaybackContactFragment2).A0H == null) {
                    Bundle bundle6 = c13630lZ.A00;
                    ((C0BA) statusPlaybackContactFragment2).A07 = bundle6 != null ? bundle6 : null;
                } else {
                    throw new IllegalStateException("Fragment already added");
                }
            }
            statusPlaybackContactFragment2.A0U(false);
            statusPlaybackContactFragment2.A0V(false);
            c05i.A09(longValue, statusPlaybackContactFragment2);
            C0D0 c0d0 = this.A01;
            int id = viewGroup.getId();
            StringBuilder sb = new StringBuilder("f");
            sb.append(longValue);
            c0d0.A09(id, statusPlaybackContactFragment2, sb.toString(), 1);
            statusPlaybackContactFragment3 = statusPlaybackContactFragment2;
        }
        return statusPlaybackContactFragment3;
    }

    @Override // X.AbstractC35271is
    public void A0H(ViewGroup viewGroup, int i, Object obj) {
        C0BA c0ba = (C0BA) obj;
        C0BA c0ba2 = this.A00;
        if (c0ba != c0ba2) {
            if (c0ba2 != null) {
                c0ba2.A0U(false);
                this.A00.A0V(false);
            }
            c0ba.A0U(true);
            c0ba.A0V(true);
            this.A00 = c0ba;
        }
    }

    @Override // X.AbstractC35271is
    public boolean A0J(View view, Object obj) {
        return ((C0BA) obj).A0A == view;
    }

    @Override // X.AbstractC35271is
    /* renamed from: A0K */
    public void A0I(ViewGroup viewGroup, int i, C0BA c0ba) {
        Bundle A00;
        int A0F = A0F(c0ba);
        C05I c05i = this.A02;
        if (c05i.A01) {
            c05i.A06();
        }
        int i2 = 0;
        while (true) {
            if (i2 >= c05i.A00) {
                i2 = -1;
                break;
            } else if (c05i.A03[i2] == c0ba) {
                break;
            } else {
                i2++;
            }
        }
        long j = -1;
        if (i2 != -1) {
            j = c05i.A01(i2);
            Object[] objArr = c05i.A03;
            Object obj = objArr[i2];
            Object obj2 = C05I.A04;
            if (obj != obj2) {
                objArr[i2] = obj2;
                c05i.A01 = true;
            }
        }
        if (c0ba.A0W() && A0F != -2) {
            C05I c05i2 = this.A03;
            AbstractC02800Cx abstractC02800Cx = this.A04;
            C09400dD c09400dD = (C09400dD) abstractC02800Cx.A0Q.A01.get(c0ba.A0S);
            if (c09400dD != null) {
                C0BA c0ba2 = c09400dD.A01;
                if (c0ba2.equals(c0ba)) {
                    int i3 = c0ba2.A04;
                    C13630lZ c13630lZ = null;
                    if (i3 > -1 && (A00 = c09400dD.A00()) != null) {
                        c13630lZ = new C13630lZ(A00);
                    }
                    c05i2.A09(j, c13630lZ);
                }
            }
            abstractC02800Cx.A0i(new IllegalStateException(C000200d.A0B(c0ba, " is not currently in the FragmentManager")));
            throw null;
        }
        this.A03.A07(j);
        C0D0 c0d0 = this.A01;
        if (c0d0 == null) {
            AbstractC02800Cx abstractC02800Cx2 = this.A04;
            if (abstractC02800Cx2 != null) {
                c0d0 = new C02820Cz(abstractC02800Cx2);
                this.A01 = c0d0;
            } else {
                throw null;
            }
        }
        c0d0.A06(c0ba);
    }
}
