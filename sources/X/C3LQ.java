package X;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.gif_search.RemoveDownloadableGifFromFavoritesDialogFragment;
import com.whatsapp.gif_search.StarDownloadableGifDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.3LQ */
/* loaded from: classes2.dex */
public final class C3LQ extends C3KV {
    public int A00;
    public C49302Jn A01;
    public C0HS A02;
    public String A03;
    public final View A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final C01B A07;
    public final AnonymousClass011 A08;
    public final C455822q A09;
    public final InterfaceC48372Ez A0A;
    public final C61462wC A0B;

    public C3LQ(C455822q c455822q, AnonymousClass011 anonymousClass011, C01B c01b, C02E c02e, C02O c02o, ViewGroup viewGroup, InterfaceC48372Ez interfaceC48372Ez, int i) {
        super(viewGroup);
        this.A09 = c455822q;
        this.A08 = anonymousClass011;
        this.A07 = c01b;
        this.A0A = interfaceC48372Ez;
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        this.A06 = (ImageView) view.findViewById(R.id.thumb_view);
        this.A04 = view.findViewById(R.id.loading_progress);
        this.A05 = (ViewGroup) view.findViewById(R.id.video_preview_container);
        if (AnonymousClass029.A06(c02o, c02e) >= 2012) {
            C61462wC c61462wC = new C61462wC(view.getContext());
            this.A0B = c61462wC;
            this.A05.addView(c61462wC.A02, new FrameLayout.LayoutParams(-1, -1));
            this.A05.setVisibility(0);
        }
    }

    @Override // X.AbstractC09080cc
    public void A0C() {
        C3KU c3ku = null;
        if (this.A01 != null) {
            ViewOnClickCListenerShape12S0100000_I1 viewOnClickCListenerShape12S0100000_I1 = new ViewOnClickCListenerShape12S0100000_I1(this, 17);
            if (this.A07.A0E(C01C.A2I)) {
                View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: X.2wA
                    {
                        C3LQ.this = this;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                        Activity A00 = C018308n.A00(view.getContext());
                        C3LQ c3lq = C3LQ.this;
                        if (c3lq.A00 == 1) {
                            C49302Jn c49302Jn = c3lq.A01;
                            StarDownloadableGifDialogFragment starDownloadableGifDialogFragment = new StarDownloadableGifDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("gif", c49302Jn);
                            starDownloadableGifDialogFragment.A0P(bundle);
                            ((ActivityC02290Ap) A00).AUh(starDownloadableGifDialogFragment);
                        }
                        if (c3lq.A00 == 2) {
                            C49302Jn c49302Jn2 = c3lq.A01;
                            RemoveDownloadableGifFromFavoritesDialogFragment removeDownloadableGifFromFavoritesDialogFragment = new RemoveDownloadableGifFromFavoritesDialogFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("gif", c49302Jn2);
                            removeDownloadableGifFromFavoritesDialogFragment.A0P(bundle2);
                            ((ActivityC02290Ap) A00).AUh(removeDownloadableGifFromFavoritesDialogFragment);
                        }
                        return true;
                    }
                };
                this.A06.setOnLongClickListener(onLongClickListener);
                this.A05.setOnLongClickListener(onLongClickListener);
            }
            ImageView imageView = this.A06;
            imageView.setOnClickListener(viewOnClickCListenerShape12S0100000_I1);
            ViewGroup viewGroup = this.A05;
            viewGroup.setOnClickListener(viewOnClickCListenerShape12S0100000_I1);
            viewGroup.setContentDescription(viewGroup.getContext().getString(R.string.gif_preview_description));
            this.A04.setVisibility(8);
            imageView.setVisibility(0);
            imageView.setImageDrawable(new ColorDrawable(13421772));
            if (this.A0B == null) {
                this.A09.A02(this.A01.A03.A02, imageView);
                return;
            }
            C49302Jn c49302Jn = this.A01;
            String str = c49302Jn.A02.A02;
            this.A03 = str;
            if (str != null) {
                C455822q c455822q = this.A09;
                int i = c49302Jn.A00;
                AnonymousClass240 anonymousClass240 = new AnonymousClass240() { // from class: X.3Bt
                    @Override // X.AnonymousClass240
                    public void AKE(Exception exc) {
                    }

                    {
                        C3LQ.this = this;
                    }

                    @Override // X.AnonymousClass240
                    public void AKO(String str2, File file, byte[] bArr) {
                        C3LQ c3lq = C3LQ.this;
                        c3lq.A02 = null;
                        if (file == null) {
                            C000200d.A15("gif/preview/holder file is null for ", str2);
                        } else if (!str2.equals(c3lq.A03)) {
                        } else {
                            if (bArr != null) {
                                c3lq.A06.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, C42471vn.A07));
                            }
                            C61462wC c61462wC = c3lq.A0B;
                            if (c61462wC != null) {
                                try {
                                    C40851sy A01 = C40851sy.A01(new File(file.getAbsolutePath()), false);
                                    c61462wC.A01 = A01;
                                    C19230v5 A0A = A01.A0A(c61462wC.A02.getContext());
                                    c61462wC.A00 = A0A;
                                    A0A.start();
                                } catch (IOException e) {
                                    Log.e("gif/loading/io-exception", e);
                                }
                                c61462wC.A03.setImageDrawable(c61462wC.A00);
                            }
                            c3lq.A06.setVisibility(8);
                        }
                    }
                };
                if (c455822q != null) {
                    C000700j.A01();
                    C04560Kx A06 = c455822q.A06.A06();
                    GifCacheItemSerializable A03 = A06.A03(str);
                    if (A03 != null && A03.A00().exists() && A03.A00 != null) {
                        anonymousClass240.AKO(str, A03.A00(), A03.A00);
                    } else {
                        ThreadPoolExecutor A01 = c455822q.A01();
                        c3ku = new C3KU(c455822q.A05, c455822q.A02, c455822q.A07, c455822q.A09, str, i, c455822q.A08, A06, anonymousClass240);
                        ((C0HS) c3ku).A02.executeOnExecutor(A01, new Void[0]);
                    }
                    this.A02 = c3ku;
                    return;
                }
                throw null;
            }
            return;
        }
        ImageView imageView2 = this.A06;
        imageView2.setOnClickListener(null);
        this.A05.setOnClickListener(null);
        imageView2.setVisibility(8);
        this.A04.setVisibility(0);
    }

    @Override // X.AbstractC09080cc
    public void A0D() {
        C0HS c0hs = this.A02;
        if (c0hs != null) {
            c0hs.A05(false);
            this.A02 = null;
        }
        C61462wC c61462wC = this.A0B;
        if (c61462wC != null) {
            C19230v5 c19230v5 = c61462wC.A00;
            if (c19230v5 != null) {
                c19230v5.stop();
                c61462wC.A00 = null;
            }
            C40851sy c40851sy = c61462wC.A01;
            if (c40851sy != null) {
                c40851sy.close();
                c61462wC.A01 = null;
            }
            c61462wC.A03.setImageDrawable(null);
        }
        this.A03 = null;
    }
}
