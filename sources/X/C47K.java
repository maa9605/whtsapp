package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.bloks.BloksCameraOverlay;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: X.47K */
/* loaded from: classes3.dex */
public final class C47K extends AbstractC30911bN {
    public final /* synthetic */ C016807u A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47K(C016807u c016807u, AnonymousClass087 anonymousClass087, C016807u c016807u2) {
        super(c016807u, anonymousClass087);
        this.A00 = c016807u2;
    }

    public static void A05(C890845p c890845p, AnonymousClass087 anonymousClass087, C016807u c016807u, byte[] bArr) {
        if (bArr == null) {
            c890845p.A0G.A02.post(new RunnableC56692nq(c890845p));
            return;
        }
        File A05 = C45Q.A05(c890845p.A0H, c890845p.A0A, false);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(c890845p.A00, cameraInfo);
        c890845p.A0I.ARy(new C0HS(anonymousClass087, bArr, cameraInfo.facing == 1, A05, c890845p.A0A, c890845p.A02, c890845p.A03, c890845p.A08, c890845p.A01, c016807u) { // from class: X.46j
            public final int A00;
            public final int A01;
            public final int A02;
            public final File A03;
            public final String A04;
            public final WeakReference A05;
            public final WeakReference A06;
            public final WeakReference A07;
            public final boolean A08;
            public final byte[] A09;

            {
                this.A06 = new WeakReference(anonymousClass087);
                this.A09 = bArr;
                this.A08 = r4;
                this.A03 = A05;
                this.A04 = r6;
                this.A01 = r7;
                this.A02 = r8;
                this.A05 = new WeakReference(r9);
                this.A00 = r10;
                this.A07 = new WeakReference(c016807u);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                Bitmap bitmap;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                byte[] bArr2 = this.A09;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
                if (this.A06.get() != null) {
                    int i = this.A00;
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    if (this.A08) {
                        Matrix matrix2 = new Matrix();
                        matrix2.postScale(1.0f, -1.0f, createBitmap.getWidth() >> 1, createBitmap.getHeight() >> 1);
                        bitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix2, true);
                    } else {
                        bitmap = createBitmap;
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.A02, this.A01, false);
                    BloksCameraOverlay bloksCameraOverlay = (BloksCameraOverlay) this.A05.get();
                    int i2 = bloksCameraOverlay.A05 - bloksCameraOverlay.A04;
                    int i3 = bloksCameraOverlay.A02 - bloksCameraOverlay.A06;
                    createScaledBitmap.getWidth();
                    createScaledBitmap.getHeight();
                    Bitmap createBitmap2 = Bitmap.createBitmap(createScaledBitmap, bloksCameraOverlay.A04, bloksCameraOverlay.A06, i2, i3);
                    createScaledBitmap.recycle();
                    createBitmap.recycle();
                    bitmap.recycle();
                    createScaledBitmap.recycle();
                    decodeByteArray.recycle();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.A03);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                        String lowerCase = this.A04.toLowerCase(Locale.US);
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg")) {
                            compressFormat = Bitmap.CompressFormat.JPEG;
                        }
                        createBitmap2.compress(compressFormat, 75, byteArrayOutputStream);
                        fileOutputStream.write(byteArrayOutputStream.toByteArray());
                        fileOutputStream.close();
                        return null;
                    } catch (FileNotFoundException e) {
                        StringBuilder A0P = C000200d.A0P("BloksStorePictureTask/ File not found: ");
                        A0P.append(e.getMessage());
                        Log.e(A0P.toString(), e);
                        return null;
                    } catch (IOException e2) {
                        StringBuilder A0P2 = C000200d.A0P("BloksStorePictureTask/ Error accessing file: ");
                        A0P2.append(e2.getMessage());
                        Log.e(A0P2.toString(), e2);
                        return null;
                    }
                }
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                AnonymousClass087 anonymousClass0872 = (AnonymousClass087) this.A06.get();
                C016807u c016807u2 = (C016807u) this.A07.get();
                if (anonymousClass0872 == null || c016807u2 == null) {
                    return;
                }
                C890845p c890845p2 = (C890845p) AnonymousClass088.A0o(anonymousClass0872, c016807u2);
                c890845p2.A0D = true;
                C45Q.A0F(anonymousClass0872, c016807u2, c890845p2);
            }
        }, new Void[0]);
    }

    public static /* synthetic */ void A06(String str, C016807u c016807u, C890845p c890845p, Camera.PictureCallback pictureCallback) {
        int hashCode = str.hashCode();
        if (hashCode != 100313435 && hashCode == 112202875 && str.equals("video")) {
            C45Q.A0H(c016807u, c890845p, c890845p.A09);
        } else {
            c890845p.A04.takePicture(null, null, pictureCallback);
        }
    }

    @Override // X.AbstractC30911bN, X.AbstractC016307p
    public Object A07(Context context) {
        return View.inflate(context, R.layout.bloks_camera_view, null);
    }

    @Override // X.AbstractC30911bN
    public View A08(Context context) {
        return View.inflate(context, R.layout.bloks_camera_view, null);
    }

    @Override // X.AbstractC30911bN
    public void A0A(View view, final AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
        int i;
        Camera camera;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        final C016807u c016807u2 = this.A00;
        final C890845p c890845p = (C890845p) AnonymousClass088.A0o(anonymousClass087, c016807u2);
        c890845p.A02 = displayMetrics.heightPixels;
        c890845p.A03 = displayMetrics.widthPixels;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bloks_camera_preview);
        if (TextUtils.equals((String) c016807u2.A00.A00(AnonymousClass461.A00), "front")) {
            c890845p.A00 = 1;
            i = 1;
        } else {
            c890845p.A00 = 0;
            i = 0;
        }
        if (Camera.getNumberOfCameras() < i + 1) {
            i = 0;
        }
        try {
            camera = Camera.open(i);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("CAMERA EXPECTION");
            sb.append(e);
            Log.e(sb.toString());
            camera = null;
        }
        c890845p.A04 = camera;
        String str = (String) c016807u2.A00.A00(AnonymousClass461.A02);
        if (str == null) {
            str = "image";
        }
        c890845p.A0B = str;
        c890845p.A0A = (String) c016807u2.A00.A00(AnonymousClass461.A01);
        c890845p.A0C = (String) c016807u2.A00.A00(AnonymousClass461.A06);
        c890845p.A0F = false;
        c890845p.A0D = false;
        c890845p.A08 = (BloksCameraOverlay) view.findViewById(R.id.camera_overlay);
        Context context = anonymousClass087.A00;
        Camera camera2 = c890845p.A04;
        int i2 = c890845p.A00;
        int i3 = c890845p.A03;
        int i4 = c890845p.A02;
        C47A c47a = new C47A(context);
        c47a.A02 = camera2;
        c47a.A01 = i3;
        c47a.A00 = i4;
        ((SurfaceHolder$CallbackC49122Io) c47a).A00 = i2;
        c890845p.A09 = c47a;
        BloksCameraOverlay bloksCameraOverlay = c890845p.A08;
        String str2 = (String) c016807u2.A00.A00(AnonymousClass461.A04);
        if (str2 == null) {
            str2 = "original";
        }
        bloksCameraOverlay.A00(str2);
        viewGroup.removeAllViews();
        viewGroup.addView(c890845p.A09);
        c890845p.A01 = c890845p.A09.getDisplayOrientation();
        View findViewById = view.findViewById(R.id.shutter);
        c890845p.A06 = anonymousClass087;
        c890845p.A07 = c016807u2.AA3(AnonymousClass461.A03);
        findViewById.setOnClickListener(new View$OnClickListenerC56712ns(str, c016807u2, c890845p, new Camera.PictureCallback() { // from class: X.2nr
            @Override // android.hardware.Camera.PictureCallback
            public final void onPictureTaken(byte[] bArr, Camera camera3) {
                C47K.A05(c890845p, anonymousClass087, c016807u2, bArr);
            }
        }));
    }

    @Override // X.AbstractC30911bN
    public void A0B(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
        C890845p c890845p = (C890845p) AnonymousClass088.A0o(anonymousClass087, this.A00);
        C45Q.A0P(c890845p);
        Camera camera = c890845p.A04;
        if (camera != null) {
            camera.release();
            c890845p.A04 = null;
        }
    }
}
