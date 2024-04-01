package com.facebook.redex;

import X.AbstractActivityC49982Om;
import X.AbstractC04890Mh;
import X.AbstractC636430h;
import X.ActivityC02290Ap;
import X.ActivityC02330At;
import X.C01C;
import X.C02180Ae;
import X.C04630Le;
import X.C0BA;
import X.C0HS;
import X.C0M6;
import X.C2EK;
import X.C2EN;
import X.C2HF;
import X.C2HG;
import X.C2HL;
import X.C2IP;
import X.C2MS;
import X.C30Y;
import X.C3H0;
import X.C3L0;
import X.C3L7;
import X.C461325b;
import X.C48352Ex;
import X.C48732Gl;
import X.C48742Gm;
import X.C48752Gn;
import X.C48792Gs;
import X.C63512zu;
import X.C67833Ha;
import X.C78833kb;
import X.GestureDetector$OnGestureListenerC61252vq;
import X.RunnableC61232vo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ClearableEditText;
import com.whatsapp.Conversation;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.crop.CropImage;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;
import com.whatsapp.mediacomposer.GifComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;
import com.whatsapp.phonematching.CountryPicker;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.profile.WebImagePicker;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment;
import com.whatsapp.registration.ChangeNumberNotifyContacts;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape3S0100000_I0_3 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape3S0100000_I0_3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.3H0, X.0HS] */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C461325b c461325b;
        Bitmap A04;
        float width;
        float height;
        switch (this.A01) {
            case 0:
                int id = view.getId();
                C2IP c2ip = (C2IP) this.A00;
                ClearableEditText clearableEditText = c2ip.A0R;
                if (id == clearableEditText.getId() && (clearableEditText.getText() == null || clearableEditText.getText().toString().isEmpty())) {
                    AbstractC636430h abstractC636430h = c2ip.A09;
                    if (abstractC636430h != null) {
                        abstractC636430h.A01 = true;
                        abstractC636430h.A00();
                    }
                    c2ip.A0C(false, 200L);
                    return;
                } else if (id == c2ip.A0J.getId()) {
                    AbstractC636430h abstractC636430h2 = c2ip.A09;
                    if (abstractC636430h2 != null) {
                        abstractC636430h2.A01 = false;
                        abstractC636430h2.A00();
                    }
                    c2ip.A0C(true, 200L);
                    return;
                } else {
                    return;
                }
            case 1:
                MediaComposerActivity mediaComposerActivity = ((C48752Gn) this.A00).A09.A00;
                Uri A03 = mediaComposerActivity.A0d.A03();
                if (A03 != null) {
                    mediaComposerActivity.A1a(A03);
                    return;
                }
                return;
            case 2:
                C48752Gn c48752Gn = (C48752Gn) this.A00;
                if (c48752Gn.A08.isRunning() || c48752Gn.A05) {
                    return;
                }
                if (c48752Gn.A00() != 1) {
                    c48752Gn.A0A.A07(1);
                    C48742Gm c48742Gm = c48752Gn.A03;
                    if (c48742Gm != null) {
                        c48742Gm.A00();
                        return;
                    }
                    return;
                }
                c48752Gn.A0A.A07(0);
                C48742Gm c48742Gm2 = c48752Gn.A03;
                if (c48742Gm2 != null) {
                    c48742Gm2.A01();
                    return;
                }
                return;
            case 3:
                C48752Gn c48752Gn2 = (C48752Gn) this.A00;
                C48742Gm c48742Gm3 = c48752Gn2.A03;
                if (c48742Gm3 == null || c48752Gn2.A02 == null || c48752Gn2.A05) {
                    return;
                }
                DoodleView doodleView = c48742Gm3.A0G;
                if (!doodleView.A0I.A03.A00.isEmpty()) {
                    C2HF c2hf = doodleView.A0I;
                    C30Y c30y = c2hf.A03;
                    List list = c2hf.A04;
                    if (c30y.A00(list) instanceof C67833Ha) {
                        doodleView.A0F.A01();
                    }
                    if (!list.contains(c2hf.A01)) {
                        c2hf.A01 = null;
                    }
                    doodleView.A0F.A0D = false;
                    doodleView.invalidate();
                }
                if (doodleView.A0I.A04()) {
                    Handler handler = doodleView.A0E;
                    Runnable runnable = doodleView.A0J;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, 1000L);
                }
                c48742Gm3.A0N.A0B.setUndoButtonVisibility(c48742Gm3.A0M.A03.A00.isEmpty() ^ true ? 0 : 8);
                c48752Gn2.A02.A02();
                c48752Gn2.A03.A05();
                return;
            case 4:
                C48752Gn c48752Gn3 = (C48752Gn) this.A00;
                if (c48752Gn3.A08.isRunning() || c48752Gn3.A05) {
                    return;
                }
                c48752Gn3.A0A.A07(c48752Gn3.A00() == 3 ? 0 : 3);
                C48742Gm c48742Gm4 = c48752Gn3.A03;
                if (c48742Gm4 == null || !c48742Gm4.A0G.A06()) {
                    return;
                }
                c48742Gm4.A09(null);
                return;
            case 5:
                C48752Gn c48752Gn4 = (C48752Gn) this.A00;
                if (c48752Gn4.A03 == null || c48752Gn4.A08.isRunning() || c48752Gn4.A05) {
                    return;
                }
                C48742Gm c48742Gm5 = c48752Gn4.A03;
                if (c48742Gm5.A0G.A06()) {
                    C48792Gs c48792Gs = c48742Gm5.A02;
                    if (c48792Gs instanceof C3L0) {
                        ImageComposerFragment imageComposerFragment = ((C3L0) c48792Gs).A00;
                        GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq = imageComposerFragment.A08.A02;
                        RunnableC61232vo runnableC61232vo = gestureDetector$OnGestureListenerC61252vq.A0J;
                        if (runnableC61232vo != null) {
                            runnableC61232vo.A00(gestureDetector$OnGestureListenerC61252vq.A00, gestureDetector$OnGestureListenerC61252vq.A03, gestureDetector$OnGestureListenerC61252vq.A0H.getWidth() >> 1, gestureDetector$OnGestureListenerC61252vq.A0H.getHeight() >> 1, 200L);
                        }
                        if (imageComposerFragment != null) {
                            Intent intent = new Intent(imageComposerFragment.A09(), CropImage.class);
                            C2EN A0y = imageComposerFragment.A0y();
                            if (!((MediaComposerFragment) imageComposerFragment).A0A.A0M.A04.isEmpty()) {
                                C48742Gm c48742Gm6 = ((MediaComposerFragment) imageComposerFragment).A0A;
                                C63512zu c63512zu = c48742Gm6.A0H;
                                String A042 = new C2EK(c63512zu.A06, c63512zu.A07, c63512zu.A02, c48742Gm6.A0M.A05).A04();
                                if (A042 != null) {
                                    intent.putExtra("doodle", A042);
                                }
                            }
                            intent.putExtra("filter", imageComposerFragment.A09.A02);
                            intent.putExtra("scaleUpIfNeeded", false);
                            intent.putExtra("cropByOutputSize", false);
                            intent.putExtra("flattenRotation", false);
                            intent.putExtra("maxCrop", imageComposerFragment.A01.A07(C01C.A3A));
                            intent.putExtra("output", Uri.fromFile(ImageComposerFragment.A00(imageComposerFragment.A00, ((MediaComposerFragment) imageComposerFragment).A00)));
                            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                            intent.setData(Uri.fromFile(A0y.AAB(((MediaComposerFragment) imageComposerFragment).A00)));
                            Rect A9I = A0y.A9I(((MediaComposerFragment) imageComposerFragment).A00);
                            if (A9I != null) {
                                intent.putExtra("initialRect", A9I);
                            }
                            intent.putExtra("rotation", imageComposerFragment.A17());
                            if (((MediaComposerFragment) imageComposerFragment).A00.getQueryParameter("flip-h") != null) {
                                intent.putExtra("flipH", true);
                            }
                            imageComposerFragment.A0C = true;
                            imageComposerFragment.A0O(intent, 1, null);
                        } else {
                            throw null;
                        }
                    }
                    c48742Gm5.A02();
                    c48742Gm5.A0I.A02 = false;
                    c48742Gm5.A0M.A01 = null;
                    c48742Gm5.A05();
                    return;
                }
                return;
            case 6:
                C48752Gn c48752Gn5 = (C48752Gn) this.A00;
                if (c48752Gn5.A08.isRunning() || c48752Gn5.A05) {
                    return;
                }
                if (c48752Gn5.A00() != 5) {
                    c48752Gn5.A0A.A07(5);
                    C48742Gm c48742Gm7 = c48752Gn5.A03;
                    if (c48742Gm7 == null || !c48742Gm7.A0G.A06()) {
                        return;
                    }
                    c48742Gm7.A02.A03();
                    C2IP c2ip2 = (C2IP) c48742Gm7.A0Q.get();
                    ColorPickerComponent colorPickerComponent = c48742Gm7.A0C;
                    ColorPickerView colorPickerView = colorPickerComponent.A06;
                    c2ip2.A02 = colorPickerView.A03;
                    c2ip2.A00 = colorPickerView.A07;
                    ((AbstractC04890Mh) c2ip2.A0Z).A01.A00();
                    c2ip2.A0R.setText("");
                    c2ip2.A07("");
                    c2ip2.A0N.setVisibility(0);
                    c48742Gm7.A0N.A0B.setToolbarExtraVisibility(0);
                    colorPickerComponent.A04(true);
                    c48742Gm7.A0I.A02 = false;
                    c48742Gm7.A05();
                    c48742Gm7.A04();
                    c48742Gm7.A02.A01();
                    if (c48742Gm7.A0D.A01) {
                        c48742Gm7.A06 = c48742Gm7.A03.A16();
                        MediaComposerFragment mediaComposerFragment = c48742Gm7.A03;
                        if (mediaComposerFragment instanceof VideoComposerFragment) {
                            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) mediaComposerFragment;
                            A04 = videoComposerFragment.A0T.A04();
                            if (A04 == null) {
                                A04 = C02180Ae.A0I(videoComposerFragment.A0U);
                            }
                        } else if (!(mediaComposerFragment instanceof ImageComposerFragment)) {
                            A04 = ((GifComposerFragment) mediaComposerFragment).A05.A04();
                        } else {
                            Bitmap photo = ((ImageComposerFragment) mediaComposerFragment).A07.getPhoto();
                            A04 = photo != null ? photo.copy(photo.getConfig(), true) : null;
                        }
                        if (A04 != null) {
                            Bitmap.Config config = A04.getConfig();
                            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                            if (!(config == config2 && A04.isMutable()) && (A04 = A04.copy(config2, true)) == null) {
                                return;
                            }
                            C2HL c2hl = c48742Gm7.A0F;
                            C63512zu c63512zu2 = c2hl.A0I;
                            if (c63512zu2.A07 != null) {
                                Canvas canvas = new Canvas(A04);
                                int i = c63512zu2.A02 % 180;
                                RectF rectF = c63512zu2.A07;
                                if (i == 90) {
                                    width = rectF.height();
                                } else {
                                    width = rectF.width();
                                }
                                int i2 = c63512zu2.A02 % 180;
                                RectF rectF2 = c63512zu2.A07;
                                if (i2 == 90) {
                                    height = rectF2.width();
                                } else {
                                    height = rectF2.height();
                                }
                                canvas.scale(A04.getWidth() / width, A04.getHeight() / height);
                                canvas.concat(c63512zu2.A09);
                                RectF rectF3 = c63512zu2.A07;
                                canvas.translate(-rectF3.left, -rectF3.top);
                                if (c2hl.A07 != null) {
                                    Iterator it = c2hl.A0J.A05.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (it.next() instanceof C67833Ha) {
                                                canvas.save();
                                                float f = 1.0f / c2hl.A04;
                                                canvas.scale(f, f);
                                                Bitmap bitmap = c2hl.A07;
                                                PointF pointF = c2hl.A0G;
                                                canvas.drawBitmap(bitmap, pointF.x, pointF.y, c2hl.A0F);
                                                canvas.restore();
                                            }
                                        }
                                    }
                                }
                                for (C2HG c2hg : c2hl.A0J.A05) {
                                    boolean z = c2hl.A0C;
                                    c2hg.A01 = z ? SystemClock.elapsedRealtime() - c2hl.A05 : 0L;
                                    if (c2hg instanceof C3L7) {
                                        ((C3L7) c2hg).A0K(canvas, z);
                                    } else {
                                        c2hg.A09(canvas);
                                    }
                                }
                            }
                            C3H0 c3h0 = c48742Gm7.A04;
                            if (c3h0 != null) {
                                c3h0.A05(true);
                            }
                            RectF rectF4 = c48742Gm7.A0H.A0B;
                            DoodleView doodleView2 = c48742Gm7.A0G;
                            ?? r2 = new C0HS(new Rect(0, 0, doodleView2.getMeasuredWidth(), doodleView2.getMeasuredHeight()), new Rect((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom), c48742Gm7.A0E) { // from class: X.3H0
                                public final Rect A00;
                                public final Rect A01;
                                public final WeakReference A02;

                                {
                                    this.A01 = r2;
                                    this.A00 = r3;
                                    this.A02 = new WeakReference(r4);
                                }

                                @Override // X.C0HS
                                public Object A07(Object[] objArr) {
                                    Bitmap[] bitmapArr = (Bitmap[]) objArr;
                                    if (bitmapArr != null) {
                                        C000700j.A06(bitmapArr.length == 1);
                                        Bitmap bitmap2 = bitmapArr[0];
                                        Rect rect = this.A01;
                                        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                                        Canvas canvas2 = new Canvas(createBitmap);
                                        canvas2.drawColor(-16777216);
                                        canvas2.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), this.A00, (Paint) null);
                                        FilterUtils.blurNative(createBitmap, 75, 2);
                                        return createBitmap;
                                    }
                                    throw null;
                                }

                                @Override // X.C0HS
                                public void A09(Object obj) {
                                    Bitmap bitmap2 = (Bitmap) obj;
                                    C3H2 c3h2 = (C3H2) this.A02.get();
                                    if (c3h2 != null) {
                                        C48742Gm c48742Gm8 = c3h2.A00;
                                        final C2HL c2hl2 = c48742Gm8.A0F;
                                        c2hl2.A08 = bitmap2;
                                        ValueAnimator valueAnimator = c2hl2.A06;
                                        if (valueAnimator == null) {
                                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                                            c2hl2.A06 = ofInt;
                                            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                                            c2hl2.A06.setDuration(300L);
                                            c2hl2.A06.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.2zi
                                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                                    C2HL c2hl3 = c2hl2;
                                                    c2hl3.A0E.setAlpha(((Number) valueAnimator2.getAnimatedValue()).intValue());
                                                    c2hl3.A0H.A00.invalidate();
                                                }
                                            });
                                        } else {
                                            valueAnimator.cancel();
                                        }
                                        c2hl2.A06.start();
                                        c48742Gm8.A03();
                                    }
                                }
                            };
                            c48742Gm7.A04 = r2;
                            c48742Gm7.A0P.ARy(r2, A04);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c48752Gn5.A0A.A07(0);
                C48742Gm c48742Gm8 = c48752Gn5.A03;
                if (c48742Gm8 != null) {
                    c48742Gm8.A01();
                    return;
                }
                return;
            case 7:
                C48732Gl c48732Gl = (C48732Gl) this.A00;
                c48732Gl.A0G(1);
                c48732Gl.A01();
                return;
            case 8:
                ((MediaViewBaseFragment) this.A00).A16();
                return;
            case 9:
                MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                if (!(mediaViewBaseFragment instanceof MediaViewFragment)) {
                    mediaViewBaseFragment.A15();
                    return;
                }
                MediaViewFragment mediaViewFragment = (MediaViewFragment) mediaViewBaseFragment;
                if (mediaViewFragment.A0w != null) {
                    mediaViewFragment.A12();
                    return;
                } else {
                    mediaViewFragment.A13();
                    return;
                }
            case 10:
                ((PopupNotification) this.A00).lambda$onCreate$2041$PopupNotification(view);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                ((PopupNotification) this.A00).lambda$onCreate$2043$PopupNotification(view);
                return;
            case 12:
                ((PopupNotification) this.A00).lambda$onCreate$2044$PopupNotification(view);
                return;
            case 13:
                ((PopupNotification) this.A00).lambda$onCreate$2042$PopupNotification(view);
                return;
            case 14:
                ((PopupNotification) this.A00).A1K();
                return;
            case 15:
                ((PopupNotification) this.A00).lambda$onCreate$2040$PopupNotification(view);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                CountryAndPhoneNumberFragment countryAndPhoneNumberFragment = (CountryAndPhoneNumberFragment) this.A00;
                Intent intent2 = new Intent(countryAndPhoneNumberFragment.A08, CountryPicker.class);
                intent2.putExtra(CountryPicker.A08, countryAndPhoneNumberFragment.A06.getText().toString());
                countryAndPhoneNumberFragment.A0O(intent2, 0, null);
                return;
            case 17:
                ((CountryPicker) this.A00).A1R();
                return;
            case 18:
                C78833kb c78833kb = ((PickerSearchDialogFragment) this.A00).A00;
                c78833kb.A00(true);
                C48352Ex c48352Ex = c78833kb.A00;
                if (c48352Ex == null || (c461325b = c48352Ex.A0M) == null) {
                    return;
                }
                c461325b.A04();
                return;
            case 19:
                ((ProfileInfoActivity) this.A00).lambda$onCreate$2068$ProfileInfoActivity(view);
                return;
            case C0M6.A01 /* 20 */:
                ((ProfileInfoActivity) this.A00).lambda$onCreate$2070$ProfileInfoActivity(view);
                return;
            case 21:
                ((ProfileInfoActivity) this.A00).lambda$onCreate$2069$ProfileInfoActivity(view);
                return;
            case 22:
                ((ProfilePhotoReminder) this.A00).lambda$onCreate$2078$ProfilePhotoReminder(view);
                return;
            case 23:
                ((ProfilePhotoReminder) this.A00).lambda$onCreate$2076$ProfilePhotoReminder(view);
                return;
            case 24:
                ((WebImagePicker) this.A00).lambda$onCreate$2086$WebImagePicker(view);
                return;
            case 25:
                ((WebImagePicker) this.A00).A1S();
                return;
            case 26:
                ((ActivityC02290Ap) this.A00).onBackPressed();
                return;
            case 27:
                ((DialogFragment) this.A00).A10();
                return;
            case 28:
                ((ActivityC02290Ap) this.A00).onBackPressed();
                return;
            case 29:
                ActivityC02330At A09 = ((C0BA) this.A00).A09();
                if (A09 instanceof AbstractActivityC49982Om) {
                    AbstractActivityC49982Om abstractActivityC49982Om = (AbstractActivityC49982Om) A09;
                    Intent intent3 = new Intent(abstractActivityC49982Om, GalleryPickerLauncher.class);
                    abstractActivityC49982Om.A0V = true;
                    abstractActivityC49982Om.startActivityForResult(intent3, 2);
                    return;
                }
                return;
            case 30:
                QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) this.A00;
                qrScanCodeFragment.A07 = null;
                qrScanCodeFragment.A05.A01.ARp();
                return;
            case 31:
                QrScanCodeFragment qrScanCodeFragment2 = (QrScanCodeFragment) this.A00;
                if (qrScanCodeFragment2.A05.AVK()) {
                    qrScanCodeFragment2.A05.AVf();
                    qrScanCodeFragment2.A0z();
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                ScannedCodeDialogFragment scannedCodeDialogFragment = (ScannedCodeDialogFragment) this.A00;
                ContactInfoActivity.A03(scannedCodeDialogFragment.A0I, scannedCodeDialogFragment.A09(), null);
                return;
            case 33:
                ((DialogFragment) this.A00).A10();
                return;
            case 34:
                ScannedCodeDialogFragment scannedCodeDialogFragment2 = (ScannedCodeDialogFragment) this.A00;
                int i3 = scannedCodeDialogFragment2.A00;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            Context A00 = scannedCodeDialogFragment2.A00();
                            if (!TextUtils.isEmpty(scannedCodeDialogFragment2.A0S)) {
                                scannedCodeDialogFragment2.A0i(Conversation.A03(A00, scannedCodeDialogFragment2.A0L, scannedCodeDialogFragment2.A0S));
                            } else {
                                scannedCodeDialogFragment2.A04.A01(scannedCodeDialogFragment2, Conversation.A02(A00, scannedCodeDialogFragment2.A0L));
                            }
                            if (scannedCodeDialogFragment2.A06.A0E(C01C.A0m)) {
                                scannedCodeDialogFragment2.A0Q.AS1(new RunnableEBaseShape5S0100000_I0_5(scannedCodeDialogFragment2, 23));
                            }
                            scannedCodeDialogFragment2.A10();
                        } else {
                            throw new IllegalArgumentException("Unhandled type");
                        }
                    }
                    scannedCodeDialogFragment2.A10();
                    return;
                } else if (scannedCodeDialogFragment2.A0I.A08 != null) {
                    scannedCodeDialogFragment2.A04.A01(scannedCodeDialogFragment2, Conversation.A02(scannedCodeDialogFragment2.A00(), scannedCodeDialogFragment2.A0L));
                    scannedCodeDialogFragment2.A10();
                    return;
                } else {
                    String A02 = C04630Le.A02(scannedCodeDialogFragment2.A0L);
                    if (A02 != null) {
                        Intent A002 = C2MS.A00(A02, scannedCodeDialogFragment2.A0I.A0O, true, false);
                        A002.putExtra("finishActivityOnSaveCompleted", true);
                        scannedCodeDialogFragment2.A0O(A002, 1, null);
                        scannedCodeDialogFragment2.A0O.A02(true, 11);
                        return;
                    }
                    throw null;
                }
            case 35:
                ScannedCodeDialogFragment scannedCodeDialogFragment3 = (ScannedCodeDialogFragment) this.A00;
                ContactInfoActivity.A03(scannedCodeDialogFragment3.A0I, scannedCodeDialogFragment3.A09(), null);
                return;
            case 36:
                ((ChangeNumberNotifyContacts) this.A00).lambda$onCreate$2148$ChangeNumberNotifyContacts(view);
                return;
            case 37:
                ((ChangeNumberNotifyContacts) this.A00).lambda$onCreate$2146$ChangeNumberNotifyContacts(view);
                return;
            case 38:
                ((ChangeNumberOverview) this.A00).lambda$onCreate$2151$ChangeNumberOverview(view);
                return;
            case 39:
                ((EULA) this.A00).lambda$onCreate$2216$EULA(view);
                return;
            case 40:
                ((RegisterName) this.A00).lambda$onCreate$1419$RegisterName(view);
                return;
            case 41:
                ((RegisterName) this.A00).lambda$onCreate$1423$RegisterName(view);
                return;
            case 42:
                ((VerifySms) this.A00).lambda$onCreate$2179$VerifySms(view);
                return;
            case 43:
                ((VerifySms) this.A00).A27(true);
                return;
            case 44:
                ((VerifySms) this.A00).lambda$onCreate$2178$VerifySms(view);
                return;
            case 45:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) ((C0BA) this.A00).A09();
                int A1P = verifyTwoFactorAuth.A1P();
                VerifyTwoFactorAuth.ConfirmWipe confirmWipe = new VerifyTwoFactorAuth.ConfirmWipe();
                Bundle bundle = new Bundle();
                bundle.putInt("wipeStatus", A1P);
                confirmWipe.A0P(bundle);
                verifyTwoFactorAuth.AUg(confirmWipe, null);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                ((DialogFragment) this.A00).A10();
                return;
            case 47:
                ((VerifyTwoFactorAuth) ((C0BA) this.A00).A09()).A1S(null, 1, false);
                return;
            case 48:
                ((ChangeNumberNotifyContacts) this.A00).onRadioButtonClicked(view);
                return;
            case 49:
                ((RestoreFromConsumerDatabaseActivity) this.A00).lambda$onCreate$2198$RestoreFromConsumerDatabaseActivity(view);
                return;
            default:
                return;
        }
    }
}
