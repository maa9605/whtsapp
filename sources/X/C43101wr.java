package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.animated.webp.WebPFrame;
import com.facebook.animated.webp.WebPImage;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.1wr */
/* loaded from: classes2.dex */
public class C43101wr {
    public static volatile C43101wr A03;
    public final C001200o A00;
    public volatile C43751xu A01;
    public volatile boolean A02;

    public C43101wr(C001200o c001200o) {
        this.A00 = c001200o;
        try {
            AnonymousClass017.A00(c001200o.A00);
        } catch (IOException unused) {
        }
    }

    public static WebPImage A00(byte[] bArr) {
        try {
            C07K.A13();
            if (bArr != null) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
                allocateDirect.put(bArr);
                allocateDirect.rewind();
                return WebPImage.nativeCreateFromDirectByteBuffer(allocateDirect);
            }
            throw null;
        } catch (IllegalArgumentException e) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/failed to create webp image object", e);
            return null;
        } catch (UnsatisfiedLinkError e2) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/unsatisfiedLinkError", e2);
            return null;
        }
    }

    public static C43101wr A01() {
        if (A03 == null) {
            synchronized (C43101wr.class) {
                if (A03 == null) {
                    A03 = new C43101wr(C001200o.A01);
                }
            }
        }
        return A03;
    }

    public static final String A02(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace("/", "-"));
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        return sb.toString();
    }

    public static void A03(Bitmap bitmap, C43751xu c43751xu, String str) {
        C43761xv A07 = c43751xu.A07(str);
        if (A07 != null) {
            OutputStream A00 = A07.A00();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                A00.write(byteArray, 0, byteArray.length);
                if (A07.A00) {
                    C43751xu c43751xu2 = A07.A02;
                    C43751xu.A02(c43751xu2, A07, false);
                    c43751xu2.A0B(A07.A01.A03);
                } else {
                    C43751xu.A02(A07.A02, A07, true);
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A00.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public final Bitmap A04(WebPImage webPImage, int i, int i2, String str) {
        Bitmap createBitmap;
        C43751xu A08;
        try {
            if (webPImage.getFrameCount() > 0) {
                createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                WebPFrame frame = webPImage.getFrame(0);
                int width = frame.getWidth();
                int height = frame.getHeight();
                int width2 = webPImage.getWidth();
                int height2 = webPImage.getHeight();
                if (height2 == height && width2 == width) {
                    frame.renderFrame(i, i2, createBitmap);
                } else {
                    Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    frame.renderFrame(width, height, createBitmap2);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.scale(i / width2, i2 / height2);
                    canvas.drawBitmap(createBitmap2, frame.getXOffset(), frame.getYOffset(), (Paint) null);
                    createBitmap2.recycle();
                }
            } else {
                createBitmap = null;
            }
            if (createBitmap != null && (A08 = A08()) != null) {
                try {
                    A03(createBitmap, A08, str);
                    return createBitmap;
                } catch (IOException e) {
                    Log.e("WebPImageLoader/saving bitmap to cache", e);
                }
            }
            return createBitmap;
        } catch (IllegalStateException e2) {
            Log.e("WebPImageLoader/createBitmapFromWebPImageAndCache/failed to create static image", e2);
            return null;
        }
    }

    public final Bitmap A05(String str) {
        C43781xx c43781xx;
        C43751xu A08 = A08();
        if (A08 != null) {
            try {
                c43781xx = A08.A08(str);
            } catch (IOException e) {
                Log.e("WebPImageLoader/error getting bitmap from cache", e);
                c43781xx = null;
            }
            if (c43781xx == null) {
                return null;
            }
            try {
                InputStream inputStream = c43781xx.A00[0];
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return decodeStream;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public Bitmap A06(String str, File file, int i, int i2) {
        Bitmap bitmap;
        String A02 = A02(str, i, i2);
        Bitmap A05 = A05(A02);
        if (A05 != null) {
            return A05;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.outHeight = i2;
        options.outWidth = i;
        WebpInfo verifyWebpFileIntegrity = WebpUtils.verifyWebpFileIntegrity(file.getAbsolutePath());
        if (verifyWebpFileIntegrity != null && verifyWebpFileIntegrity.numFrames == 1) {
            options.inSampleSize = C002701i.A02(verifyWebpFileIntegrity.width, verifyWebpFileIntegrity.height, i, i2, 1);
            bitmap = WebpBitmapFactoryImpl.hookDecodeFile(file.getAbsolutePath(), options);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            C43751xu A08 = A08();
            if (A08 != null) {
                try {
                    A03(bitmap, A08, A02);
                    return bitmap;
                } catch (IOException e) {
                    Log.e("WebPImageLoader/saving bitmap to cache", e);
                }
            }
            return bitmap;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AnonymousClass024.A0V(fileInputStream, byteArrayOutputStream);
            Bitmap A07 = A07(str, byteArrayOutputStream.toByteArray(), i, i2);
            byteArrayOutputStream.close();
            fileInputStream.close();
            return A07;
        } catch (FileNotFoundException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("loadStaticImageAsBitmapFromFile/getting sticker bitmap failed:");
            sb.append(str);
            Log.e(sb.toString(), e2);
            return null;
        } catch (IOException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadStaticImageAsBitmapFromFile/getting sticker bitmap failed:");
            sb2.append(str);
            Log.e(sb2.toString(), e3);
            return null;
        }
    }

    public Bitmap A07(String str, byte[] bArr, int i, int i2) {
        String A02 = A02(str, i, i2);
        Bitmap A05 = A05(A02);
        if (A05 != null) {
            return A05;
        }
        WebPImage A00 = A00(bArr);
        if (A00 == null) {
            return null;
        }
        return A04(A00, i, i2, A02);
    }

    public final C43751xu A08() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    File file = new File(this.A00.A00.getCacheDir(), "webp_static_cache");
                    if (!file.exists() && !file.mkdirs()) {
                        Log.e("WebPImageLoader/getDiskLruCache could not init directory");
                    } else {
                        try {
                            this.A01 = C43751xu.A00(file, 2097152L);
                        } catch (IOException e) {
                            Log.e("WebPImageLoader/getDiskLruCache error opening cache", e);
                        }
                    }
                    this.A02 = true;
                }
            }
        }
        return this.A01;
    }
}
