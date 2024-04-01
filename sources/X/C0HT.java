package X;

import android.util.Log;
import android.util.Pair;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0HT */
/* loaded from: classes.dex */
public class C0HT {
    public static SimpleDateFormat A0G;
    public static final C13490lL A0H;
    public static final C13490lL A0I;
    public static final C13490lL A0J;
    public static final Charset A0K;
    public static final HashMap A0L;
    public static final HashSet A0M;
    public static final Pattern A0N;
    public static final byte[] A0O;
    public static final byte[] A0P;
    public static final byte[] A0Q;
    public static final byte[] A0R;
    public static final byte[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final C13490lL[] A0W;
    public static final C13490lL[] A0X;
    public static final C13490lL[] A0Y;
    public static final C13490lL[] A0Z;
    public static final C13490lL[] A0a;
    public static final C13490lL[] A0b;
    public static final C13490lL[] A0c;
    public static final C13490lL[] A0d;
    public static final C13490lL[] A0e;
    public static final C13490lL[] A0f;
    public static final String[] A0g;
    public static final HashMap[] A0h;
    public static final HashMap[] A0i;
    public static final C13490lL[][] A0j;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public ByteOrder A09;
    public Set A0A;
    public boolean A0B;
    public boolean A0C;
    public byte[] A0D;
    public final String A0E;
    public final HashMap[] A0F;

    static {
        C13490lL[] c13490lLArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        A0U = new int[]{8, 8, 8};
        A0T = new int[]{8};
        A0Q = new byte[]{-1, -40, -1};
        A0R = new byte[]{79, 76, 89, 77, 80, 0};
        A0S = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        A0g = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        A0V = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        A0O = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C13490lL[] c13490lLArr2 = {new C13490lL("NewSubfileType", 254, 4), new C13490lL("SubfileType", 255, 4), new C13490lL("ImageWidth", 256), new C13490lL("ImageLength", 257), new C13490lL("BitsPerSample", 258, 3), new C13490lL("Compression", 259, 3), new C13490lL("PhotometricInterpretation", 262, 3), new C13490lL("ImageDescription", 270, 2), new C13490lL("Make", 271, 2), new C13490lL("Model", 272, 2), new C13490lL("StripOffsets", 273), new C13490lL("Orientation", 274, 3), new C13490lL("SamplesPerPixel", 277, 3), new C13490lL("RowsPerStrip", 278), new C13490lL("StripByteCounts", 279), new C13490lL("XResolution", 282, 5), new C13490lL("YResolution", 283, 5), new C13490lL("PlanarConfiguration", 284, 3), new C13490lL("ResolutionUnit", 296, 3), new C13490lL("TransferFunction", 301, 3), new C13490lL("Software", 305, 2), new C13490lL("DateTime", 306, 2), new C13490lL("Artist", 315, 2), new C13490lL("WhitePoint", 318, 5), new C13490lL("PrimaryChromaticities", 319, 5), new C13490lL("SubIFDPointer", 330, 4), new C13490lL("JPEGInterchangeFormat", 513, 4), new C13490lL("JPEGInterchangeFormatLength", 514, 4), new C13490lL("YCbCrCoefficients", 529, 5), new C13490lL("YCbCrSubSampling", 530, 3), new C13490lL("YCbCrPositioning", 531, 3), new C13490lL("ReferenceBlackWhite", 532, 5), new C13490lL("Copyright", 33432, 2), new C13490lL("ExifIFDPointer", 34665, 4), new C13490lL("GPSInfoIFDPointer", 34853, 4), new C13490lL("SensorTopBorder", 4, 4), new C13490lL("SensorLeftBorder", 5, 4), new C13490lL("SensorBottomBorder", 6, 4), new C13490lL("SensorRightBorder", 7, 4), new C13490lL("ISO", 23, 3), new C13490lL("JpgFromRaw", 46, 7)};
        A0b = c13490lLArr2;
        C13490lL[] c13490lLArr3 = {new C13490lL("ExposureTime", 33434, 5), new C13490lL("FNumber", 33437, 5), new C13490lL("ExposureProgram", 34850, 3), new C13490lL("SpectralSensitivity", 34852, 2), new C13490lL("PhotographicSensitivity", 34855, 3), new C13490lL("OECF", 34856, 7), new C13490lL("ExifVersion", 36864, 2), new C13490lL("DateTimeOriginal", 36867, 2), new C13490lL("DateTimeDigitized", 36868, 2), new C13490lL("ComponentsConfiguration", 37121, 7), new C13490lL("CompressedBitsPerPixel", 37122, 5), new C13490lL("ShutterSpeedValue", 37377, 10), new C13490lL("ApertureValue", 37378, 5), new C13490lL("BrightnessValue", 37379, 10), new C13490lL("ExposureBiasValue", 37380, 10), new C13490lL("MaxApertureValue", 37381, 5), new C13490lL("SubjectDistance", 37382, 5), new C13490lL("MeteringMode", 37383, 3), new C13490lL("LightSource", 37384, 3), new C13490lL("Flash", 37385, 3), new C13490lL("FocalLength", 37386, 5), new C13490lL("SubjectArea", 37396, 3), new C13490lL("MakerNote", 37500, 7), new C13490lL("UserComment", 37510, 7), new C13490lL("SubSecTime", 37520, 2), new C13490lL("SubSecTimeOriginal", 37521, 2), new C13490lL("SubSecTimeDigitized", 37522, 2), new C13490lL("FlashpixVersion", 40960, 7), new C13490lL("ColorSpace", 40961, 3), new C13490lL("PixelXDimension", 40962), new C13490lL("PixelYDimension", 40963), new C13490lL("RelatedSoundFile", 40964, 2), new C13490lL("InteroperabilityIFDPointer", 40965, 4), new C13490lL("FlashEnergy", 41483, 5), new C13490lL("SpatialFrequencyResponse", 41484, 7), new C13490lL("FocalPlaneXResolution", 41486, 5), new C13490lL("FocalPlaneYResolution", 41487, 5), new C13490lL("FocalPlaneResolutionUnit", 41488, 3), new C13490lL("SubjectLocation", 41492, 3), new C13490lL("ExposureIndex", 41493, 5), new C13490lL("SensingMethod", 41495, 3), new C13490lL("FileSource", 41728, 7), new C13490lL("SceneType", 41729, 7), new C13490lL("CFAPattern", 41730, 7), new C13490lL("CustomRendered", 41985, 3), new C13490lL("ExposureMode", 41986, 3), new C13490lL("WhiteBalance", 41987, 3), new C13490lL("DigitalZoomRatio", 41988, 5), new C13490lL("FocalLengthIn35mmFilm", 41989, 3), new C13490lL("SceneCaptureType", 41990, 3), new C13490lL("GainControl", 41991, 3), new C13490lL("Contrast", 41992, 3), new C13490lL("Saturation", 41993, 3), new C13490lL("Sharpness", 41994, 3), new C13490lL("DeviceSettingDescription", 41995, 7), new C13490lL("SubjectDistanceRange", 41996, 3), new C13490lL("ImageUniqueID", 42016, 2), new C13490lL("DNGVersion", 50706, 1), new C13490lL("DefaultCropSize", 50720)};
        A0X = c13490lLArr3;
        C13490lL[] c13490lLArr4 = {new C13490lL("GPSVersionID", 0, 1), new C13490lL("GPSLatitudeRef", 1, 2), new C13490lL("GPSLatitude", 2, 5), new C13490lL("GPSLongitudeRef", 3, 2), new C13490lL("GPSLongitude", 4, 5), new C13490lL("GPSAltitudeRef", 5, 1), new C13490lL("GPSAltitude", 6, 5), new C13490lL("GPSTimeStamp", 7, 5), new C13490lL("GPSSatellites", 8, 2), new C13490lL("GPSStatus", 9, 2), new C13490lL("GPSMeasureMode", 10, 2), new C13490lL("GPSDOP", 11, 5), new C13490lL("GPSSpeedRef", 12, 2), new C13490lL("GPSSpeed", 13, 5), new C13490lL("GPSTrackRef", 14, 2), new C13490lL("GPSTrack", 15, 5), new C13490lL("GPSImgDirectionRef", 16, 2), new C13490lL("GPSImgDirection", 17, 5), new C13490lL("GPSMapDatum", 18, 2), new C13490lL("GPSDestLatitudeRef", 19, 2), new C13490lL("GPSDestLatitude", 20, 5), new C13490lL("GPSDestLongitudeRef", 21, 2), new C13490lL("GPSDestLongitude", 22, 5), new C13490lL("GPSDestBearingRef", 23, 2), new C13490lL("GPSDestBearing", 24, 5), new C13490lL("GPSDestDistanceRef", 25, 2), new C13490lL("GPSDestDistance", 26, 5), new C13490lL("GPSProcessingMethod", 27, 7), new C13490lL("GPSAreaInformation", 28, 7), new C13490lL("GPSDateStamp", 29, 2), new C13490lL("GPSDifferential", 30, 3)};
        A0Y = c13490lLArr4;
        C13490lL[] c13490lLArr5 = {new C13490lL("InteroperabilityIndex", 1, 2)};
        A0Z = c13490lLArr5;
        C13490lL[] c13490lLArr6 = {new C13490lL("NewSubfileType", 254, 4), new C13490lL("SubfileType", 255, 4), new C13490lL("ThumbnailImageWidth", 256), new C13490lL("ThumbnailImageLength", 257), new C13490lL("BitsPerSample", 258, 3), new C13490lL("Compression", 259, 3), new C13490lL("PhotometricInterpretation", 262, 3), new C13490lL("ImageDescription", 270, 2), new C13490lL("Make", 271, 2), new C13490lL("Model", 272, 2), new C13490lL("StripOffsets", 273), new C13490lL("Orientation", 274, 3), new C13490lL("SamplesPerPixel", 277, 3), new C13490lL("RowsPerStrip", 278), new C13490lL("StripByteCounts", 279), new C13490lL("XResolution", 282, 5), new C13490lL("YResolution", 283, 5), new C13490lL("PlanarConfiguration", 284, 3), new C13490lL("ResolutionUnit", 296, 3), new C13490lL("TransferFunction", 301, 3), new C13490lL("Software", 305, 2), new C13490lL("DateTime", 306, 2), new C13490lL("Artist", 315, 2), new C13490lL("WhitePoint", 318, 5), new C13490lL("PrimaryChromaticities", 319, 5), new C13490lL("SubIFDPointer", 330, 4), new C13490lL("JPEGInterchangeFormat", 513, 4), new C13490lL("JPEGInterchangeFormatLength", 514, 4), new C13490lL("YCbCrCoefficients", 529, 5), new C13490lL("YCbCrSubSampling", 530, 3), new C13490lL("YCbCrPositioning", 531, 3), new C13490lL("ReferenceBlackWhite", 532, 5), new C13490lL("Copyright", 33432, 2), new C13490lL("ExifIFDPointer", 34665, 4), new C13490lL("GPSInfoIFDPointer", 34853, 4), new C13490lL("DNGVersion", 50706, 1), new C13490lL("DefaultCropSize", 50720)};
        A0a = c13490lLArr6;
        A0J = new C13490lL("StripOffsets", 273, 3);
        C13490lL[] c13490lLArr7 = {new C13490lL("ThumbnailImage", 256, 7), new C13490lL("CameraSettingsIFDPointer", 8224, 4), new C13490lL("ImageProcessingIFDPointer", 8256, 4)};
        A0e = c13490lLArr7;
        C13490lL[] c13490lLArr8 = {new C13490lL("PreviewImageStart", 257, 4), new C13490lL("PreviewImageLength", 258, 4)};
        A0c = c13490lLArr8;
        C13490lL[] c13490lLArr9 = {new C13490lL("AspectFrame", 4371, 3)};
        A0d = c13490lLArr9;
        C13490lL[] c13490lLArr10 = {new C13490lL("ColorSpace", 55, 3)};
        A0f = c13490lLArr10;
        A0j = new C13490lL[][]{c13490lLArr2, c13490lLArr3, c13490lLArr4, c13490lLArr5, c13490lLArr6, c13490lLArr2, c13490lLArr7, c13490lLArr8, c13490lLArr9, c13490lLArr10};
        A0W = new C13490lL[]{new C13490lL("SubIFDPointer", 330, 4), new C13490lL("ExifIFDPointer", 34665, 4), new C13490lL("GPSInfoIFDPointer", 34853, 4), new C13490lL("InteroperabilityIFDPointer", 40965, 4), new C13490lL("CameraSettingsIFDPointer", 8224, 1), new C13490lL("ImageProcessingIFDPointer", 8256, 1)};
        A0I = new C13490lL("JPEGInterchangeFormat", 513, 4);
        A0H = new C13490lL("JPEGInterchangeFormatLength", 514, 4);
        A0h = new HashMap[10];
        A0i = new HashMap[10];
        A0M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        A0L = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        A0K = forName;
        A0P = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        A0G = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C13490lL[][] c13490lLArr11 = A0j;
            if (i < c13490lLArr11.length) {
                A0h[i] = new HashMap();
                A0i[i] = new HashMap();
                for (C13490lL c13490lL : c13490lLArr11[i]) {
                    A0h[i].put(Integer.valueOf(c13490lL.A00), c13490lL);
                    A0i[i].put(c13490lL.A03, c13490lL);
                }
                i++;
            } else {
                HashMap hashMap = A0L;
                hashMap.put(Integer.valueOf(A0W[0].A00), 5);
                hashMap.put(Integer.valueOf(A0W[1].A00), 1);
                hashMap.put(Integer.valueOf(A0W[2].A00), 2);
                hashMap.put(Integer.valueOf(A0W[3].A00), 3);
                hashMap.put(Integer.valueOf(A0W[4].A00), 7);
                hashMap.put(Integer.valueOf(A0W[5].A00), 8);
                Pattern.compile(".*[1-9].*");
                A0N = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x02ab, code lost:
        if (java.util.Arrays.equals(r2, r1) != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0HT(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HT.<init>(java.lang.String):void");
    }

    public static Pair A00(String str) {
        int i;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair A00 = A00(split[0]);
            if (((Number) A00.first).intValue() == 2) {
                return A00;
            }
            for (int i2 = 1; i2 < split.length; i2++) {
                Pair A002 = A00(split[i2]);
                Object obj = A002.first;
                int intValue = (obj.equals(A00.first) || A002.second.equals(A00.first)) ? ((Number) A00.first).intValue() : -1;
                if (((Number) A00.second).intValue() != -1 && (obj.equals(A00.second) || A002.second.equals(A00.second))) {
                    i = ((Number) A00.second).intValue();
                } else {
                    i = -1;
                }
                if (intValue == -1 && i == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    A00 = new Pair(Integer.valueOf(i), -1);
                } else if (i == -1) {
                    A00 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return A00;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble < 0 || parseDouble2 < 0) {
                        return new Pair(10, -1);
                    }
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        } else {
            try {
                try {
                    long longValue = Long.valueOf(Long.parseLong(str)).longValue();
                    if (longValue >= 0 && longValue <= 65535) {
                        return new Pair(3, 4);
                    }
                    if (longValue < 0) {
                        return new Pair(9, -1);
                    }
                    return new Pair(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair(2, -1);
            }
        }
    }

    public static final ByteOrder A01(C13470lJ c13470lJ) {
        short readShort = c13470lJ.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder A0P2 = C000200d.A0P("Invalid byte order: ");
            A0P2.append(Integer.toHexString(readShort));
            throw new IOException(A0P2.toString());
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public static void A02(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public final C0HU A03(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < A0j.length; i++) {
            C0HU c0hu = (C0HU) this.A0F[i].get(str);
            if (c0hu != null) {
                return c0hu;
            }
        }
        return null;
    }

    public String A04(String str) {
        double d;
        C0HU A03 = A03(str);
        if (A03 != null) {
            if (!A0M.contains(str)) {
                return A03.A08(this.A09);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = A03.A00;
                if (i != 5 && i != 10) {
                    StringBuilder A0P2 = C000200d.A0P("GPS Timestamp format is not rational. format=");
                    A0P2.append(i);
                    Log.w("ExifInterface", A0P2.toString());
                    return null;
                }
                C13500lM[] c13500lMArr = (C13500lM[]) A03.A07(this.A09);
                if (c13500lMArr != null && c13500lMArr.length == 3) {
                    C13500lM c13500lM = c13500lMArr[0];
                    C13500lM c13500lM2 = c13500lMArr[1];
                    C13500lM c13500lM3 = c13500lMArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) c13500lM.A01) / ((float) c13500lM.A00))), Integer.valueOf((int) (((float) c13500lM2.A01) / ((float) c13500lM2.A00))), Integer.valueOf((int) (((float) c13500lM3.A01) / ((float) c13500lM3.A00))));
                }
                StringBuilder A0P3 = C000200d.A0P("Invalid GPS Timestamp array. array=");
                A0P3.append(Arrays.toString(c13500lMArr));
                Log.w("ExifInterface", A0P3.toString());
                return null;
            }
            try {
                Object A07 = A03.A07(this.A09);
                if (A07 != null) {
                    if (A07 instanceof String) {
                        d = Double.parseDouble((String) A07);
                    } else if (A07 instanceof long[]) {
                        long[] jArr = (long[]) A07;
                        if (jArr.length == 1) {
                            d = jArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (A07 instanceof int[]) {
                        int[] iArr = (int[]) A07;
                        if (iArr.length == 1) {
                            d = iArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (A07 instanceof double[]) {
                        double[] dArr = (double[]) A07;
                        if (dArr.length == 1) {
                            d = dArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (A07 instanceof C13500lM[]) {
                        C13500lM[] c13500lMArr2 = (C13500lM[]) A07;
                        if (c13500lMArr2.length == 1) {
                            C13500lM c13500lM4 = c13500lMArr2[0];
                            d = c13500lM4.A01 / c13500lM4.A00;
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else {
                        throw new NumberFormatException("Couldn't find a double value");
                    }
                    return Double.toString(d);
                }
                throw new NumberFormatException("NULL can't be converted to a double value");
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public void A05() {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (this.A0C && this.A01 == 4) {
            String str = this.A0E;
            if (str != null) {
                int i = this.A06;
                FileInputStream fileInputStream2 = null;
                this.A0D = (i == 6 || i == 7) ? A0H() : null;
                File file = new File(C000200d.A0L(new StringBuilder(), str, ".tmp"));
                if (new File(str).renameTo(file)) {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            fileOutputStream = new FileOutputStream(str);
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = null;
                            fileInputStream2 = fileInputStream;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                    try {
                        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                        C13480lK c13480lK = new C13480lK(fileOutputStream, ByteOrder.BIG_ENDIAN);
                        if (dataInputStream.readByte() == -1) {
                            OutputStream outputStream = c13480lK.A01;
                            outputStream.write(-1);
                            if (dataInputStream.readByte() == -40) {
                                outputStream.write(-40);
                                outputStream.write(-1);
                                outputStream.write(-31);
                                int length = A0j.length;
                                int[] iArr = new int[length];
                                int[] iArr2 = new int[length];
                                C13490lL[] c13490lLArr = A0W;
                                for (C13490lL c13490lL : c13490lLArr) {
                                    A0F(c13490lL.A03);
                                }
                                A0F("JPEGInterchangeFormat");
                                A0F("JPEGInterchangeFormatLength");
                                for (int i2 = 0; i2 < length; i2++) {
                                    HashMap[] hashMapArr = this.A0F;
                                    for (Object obj : hashMapArr[i2].entrySet().toArray()) {
                                        Map.Entry entry = (Map.Entry) obj;
                                        if (entry.getValue() == null) {
                                            hashMapArr[i2].remove(entry.getKey());
                                        }
                                    }
                                }
                                HashMap[] hashMapArr2 = this.A0F;
                                if (!hashMapArr2[1].isEmpty()) {
                                    hashMapArr2[0].put(c13490lLArr[1].A03, C0HU.A01(0L, this.A09));
                                }
                                if (!hashMapArr2[2].isEmpty()) {
                                    hashMapArr2[0].put(c13490lLArr[2].A03, C0HU.A01(0L, this.A09));
                                }
                                if (!hashMapArr2[3].isEmpty()) {
                                    hashMapArr2[1].put(c13490lLArr[3].A03, C0HU.A01(0L, this.A09));
                                }
                                if (this.A0B) {
                                    hashMapArr2[4].put("JPEGInterchangeFormat", C0HU.A01(0L, this.A09));
                                    hashMapArr2[4].put("JPEGInterchangeFormatLength", C0HU.A01(this.A07, this.A09));
                                }
                                for (int i3 = 0; i3 < length; i3++) {
                                    int i4 = 0;
                                    for (Map.Entry entry2 : hashMapArr2[i3].entrySet()) {
                                        C0HU c0hu = (C0HU) entry2.getValue();
                                        if (c0hu != null) {
                                            int i5 = A0V[c0hu.A00] * c0hu.A01;
                                            if (i5 > 4) {
                                                i4 += i5;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                    iArr2[i3] = iArr2[i3] + i4;
                                }
                                int i6 = 8;
                                for (int i7 = 0; i7 < length; i7++) {
                                    if (!hashMapArr2[i7].isEmpty()) {
                                        iArr[i7] = i6;
                                        i6 += (hashMapArr2[i7].size() * 12) + 2 + 4 + iArr2[i7];
                                    }
                                }
                                if (this.A0B) {
                                    hashMapArr2[4].put("JPEGInterchangeFormat", C0HU.A01(i6, this.A09));
                                    this.A08 = i6 + 6;
                                    i6 += this.A07;
                                }
                                int i8 = i6 + 8;
                                if (!hashMapArr2[1].isEmpty()) {
                                    hashMapArr2[0].put(c13490lLArr[1].A03, C0HU.A01(iArr[1], this.A09));
                                }
                                if (!hashMapArr2[2].isEmpty()) {
                                    hashMapArr2[0].put(c13490lLArr[2].A03, C0HU.A01(iArr[2], this.A09));
                                }
                                if (!hashMapArr2[3].isEmpty()) {
                                    hashMapArr2[1].put(c13490lLArr[3].A03, C0HU.A01(iArr[3], this.A09));
                                }
                                c13480lK.A01((short) i8);
                                byte[] bArr = A0P;
                                outputStream.write(bArr);
                                c13480lK.A01(this.A09 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                                c13480lK.A00 = this.A09;
                                c13480lK.A01((short) 42);
                                c13480lK.A00((int) 8);
                                for (int i9 = 0; i9 < length; i9++) {
                                    if (!hashMapArr2[i9].isEmpty()) {
                                        c13480lK.A01((short) hashMapArr2[i9].size());
                                        HashMap hashMap = hashMapArr2[i9];
                                        int size = (hashMap.size() * 12) + iArr[i9] + 2 + 4;
                                        for (Map.Entry entry3 : hashMap.entrySet()) {
                                            int i10 = ((C13490lL) A0i[i9].get(entry3.getKey())).A00;
                                            C0HU c0hu2 = (C0HU) entry3.getValue();
                                            if (c0hu2 != null) {
                                                int[] iArr3 = A0V;
                                                int i11 = c0hu2.A00;
                                                int i12 = iArr3[i11];
                                                int i13 = c0hu2.A01;
                                                int i14 = i12 * i13;
                                                c13480lK.A01((short) i10);
                                                c13480lK.A01((short) i11);
                                                c13480lK.A00(i13);
                                                if (i14 > 4) {
                                                    c13480lK.A00(size);
                                                    size += i14;
                                                } else {
                                                    outputStream.write(c0hu2.A02);
                                                    if (i14 < 4) {
                                                        while (i14 < 4) {
                                                            outputStream.write(0);
                                                            i14++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw null;
                                            }
                                        }
                                        if (i9 != 0 || hashMapArr2[4].isEmpty()) {
                                            c13480lK.A00((int) 0);
                                        } else {
                                            c13480lK.A00(iArr[4]);
                                        }
                                        for (Map.Entry entry4 : hashMapArr2[i9].entrySet()) {
                                            byte[] bArr2 = ((C0HU) entry4.getValue()).A02;
                                            int length2 = bArr2.length;
                                            if (length2 > 4) {
                                                outputStream.write(bArr2, 0, length2);
                                            }
                                        }
                                    }
                                }
                                if (this.A0B) {
                                    outputStream.write(A0H());
                                }
                                c13480lK.A00 = ByteOrder.BIG_ENDIAN;
                                byte[] bArr3 = new byte[4096];
                                while (dataInputStream.readByte() == -1) {
                                    byte readByte = dataInputStream.readByte();
                                    if (readByte == -39 || readByte == -38) {
                                        outputStream.write(-1);
                                        outputStream.write(readByte);
                                        byte[] bArr4 = new byte[8192];
                                        while (true) {
                                            int read = dataInputStream.read(bArr4);
                                            if (read != -1) {
                                                outputStream.write(bArr4, 0, read);
                                            } else {
                                                A02(fileInputStream);
                                                A02(fileOutputStream);
                                                file.delete();
                                                this.A0D = null;
                                                return;
                                            }
                                        }
                                    } else if (readByte == -31) {
                                        int readUnsignedShort = dataInputStream.readUnsignedShort() - 2;
                                        if (readUnsignedShort >= 0) {
                                            byte[] bArr5 = new byte[6];
                                            if (readUnsignedShort >= 6) {
                                                if (dataInputStream.read(bArr5) == 6) {
                                                    if (Arrays.equals(bArr5, bArr)) {
                                                        int i15 = readUnsignedShort - 6;
                                                        if (dataInputStream.skipBytes(i15) != i15) {
                                                            throw new IOException("Invalid length");
                                                        }
                                                    }
                                                } else {
                                                    throw new IOException("Invalid exif");
                                                }
                                            }
                                            outputStream.write(-1);
                                            outputStream.write(readByte);
                                            c13480lK.A01((short) (readUnsignedShort + 2));
                                            if (readUnsignedShort >= 6) {
                                                readUnsignedShort -= 6;
                                                outputStream.write(bArr5);
                                            }
                                            while (readUnsignedShort > 0) {
                                                int read2 = dataInputStream.read(bArr3, 0, Math.min(readUnsignedShort, 4096));
                                                if (read2 >= 0) {
                                                    outputStream.write(bArr3, 0, read2);
                                                    readUnsignedShort -= read2;
                                                }
                                            }
                                        } else {
                                            throw new IOException("Invalid length");
                                        }
                                    } else {
                                        outputStream.write(-1);
                                        outputStream.write(readByte);
                                        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                                        c13480lK.A01((short) readUnsignedShort2);
                                        int i16 = readUnsignedShort2 - 2;
                                        if (i16 < 0) {
                                            throw new IOException("Invalid length");
                                        }
                                        while (i16 > 0) {
                                            int read3 = dataInputStream.read(bArr3, 0, Math.min(i16, 4096));
                                            if (read3 >= 0) {
                                                outputStream.write(bArr3, 0, read3);
                                                i16 -= read3;
                                            }
                                        }
                                    }
                                }
                                throw new IOException("Invalid marker");
                            }
                            throw new IOException("Invalid marker");
                        }
                        throw new IOException("Invalid marker");
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                        A02(fileInputStream2);
                        A02(fileOutputStream);
                        file.delete();
                        throw th;
                    }
                }
                StringBuilder A0P2 = C000200d.A0P("Could not rename to ");
                A0P2.append(file.getAbsolutePath());
                throw new IOException(A0P2.toString());
            }
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
    }

    public final void A06() {
        String A04 = A04("DateTimeOriginal");
        if (A04 != null && A04("DateTime") == null) {
            this.A0F[0].put("DateTime", C0HU.A02(A04));
        }
        if (A04("ImageWidth") == null) {
            this.A0F[0].put("ImageWidth", C0HU.A01(0L, this.A09));
        }
        if (A04("ImageLength") == null) {
            this.A0F[0].put("ImageLength", C0HU.A01(0L, this.A09));
        }
        if (A04("Orientation") == null) {
            this.A0F[0].put("Orientation", C0HU.A01(0L, this.A09));
        }
        if (A04("LightSource") == null) {
            this.A0F[1].put("LightSource", C0HU.A01(0L, this.A09));
        }
    }

    public final void A07(int i, int i2) {
        HashMap[] hashMapArr = this.A0F;
        HashMap hashMap = hashMapArr[i];
        if (hashMap.isEmpty() || hashMapArr[i2].isEmpty()) {
            return;
        }
        C0HU c0hu = (C0HU) hashMap.get("ImageLength");
        C0HU c0hu2 = (C0HU) hashMapArr[i].get("ImageWidth");
        C0HU c0hu3 = (C0HU) hashMapArr[i2].get("ImageLength");
        C0HU c0hu4 = (C0HU) hashMapArr[i2].get("ImageWidth");
        if (c0hu == null || c0hu2 == null || c0hu3 == null || c0hu4 == null) {
            return;
        }
        int A06 = c0hu.A06(this.A09);
        int A062 = c0hu2.A06(this.A09);
        int A063 = c0hu3.A06(this.A09);
        int A064 = c0hu4.A06(this.A09);
        if (A06 >= A063 || A062 >= A064) {
            return;
        }
        HashMap hashMap2 = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap2;
    }

    public final void A08(C13470lJ c13470lJ) {
        C0HU c0hu;
        A09(c13470lJ, c13470lJ.available());
        A0A(c13470lJ, 0);
        A0B(c13470lJ, 0);
        A0B(c13470lJ, 5);
        A0B(c13470lJ, 4);
        A07(0, 5);
        A07(0, 4);
        A07(5, 4);
        HashMap[] hashMapArr = this.A0F;
        Object obj = hashMapArr[1].get("PixelXDimension");
        Object obj2 = hashMapArr[1].get("PixelYDimension");
        if (obj != null && obj2 != null) {
            hashMapArr[0].put("ImageWidth", obj);
            hashMapArr[0].put("ImageLength", obj2);
        }
        if (hashMapArr[4].isEmpty() && A0G(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!A0G(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.A01 != 8 || (c0hu = (C0HU) hashMapArr[1].get("MakerNote")) == null) {
            return;
        }
        C13470lJ c13470lJ2 = new C13470lJ(new ByteArrayInputStream(c0hu.A02));
        c13470lJ2.A02 = this.A09;
        c13470lJ2.A00(6L);
        A0A(c13470lJ2, 9);
        Object obj3 = hashMapArr[9].get("ColorSpace");
        if (obj3 != null) {
            hashMapArr[1].put("ColorSpace", obj3);
        }
    }

    public final void A09(C13470lJ c13470lJ, int i) {
        ByteOrder A01 = A01(c13470lJ);
        this.A09 = A01;
        c13470lJ.A02 = A01;
        int readUnsignedShort = c13470lJ.readUnsignedShort();
        int i2 = this.A01;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            StringBuilder A0P2 = C000200d.A0P("Invalid start code: ");
            A0P2.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(A0P2.toString());
        }
        int readInt = c13470lJ.readInt();
        if (readInt >= 8 && readInt < i) {
            int i3 = readInt - 8;
            if (i3 > 0 && c13470lJ.skipBytes(i3) != i3) {
                throw new IOException(C000200d.A0D("Couldn't jump to first Ifd: ", i3));
            }
            return;
        }
        throw new IOException(C000200d.A0D("Invalid first Ifd offset: ", readInt));
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x01d0, code lost:
        if (r6 == 7) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A(X.C13470lJ r28, int r29) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HT.A0A(X.0lJ, int):void");
    }

    public final void A0B(C13470lJ c13470lJ, int i) {
        C0HU c0hu;
        C0HU A00;
        C0HU A002;
        HashMap[] hashMapArr = this.A0F;
        C0HU c0hu2 = (C0HU) hashMapArr[i].get("DefaultCropSize");
        C0HU c0hu3 = (C0HU) hashMapArr[i].get("SensorTopBorder");
        C0HU c0hu4 = (C0HU) hashMapArr[i].get("SensorLeftBorder");
        C0HU c0hu5 = (C0HU) hashMapArr[i].get("SensorBottomBorder");
        C0HU c0hu6 = (C0HU) hashMapArr[i].get("SensorRightBorder");
        if (c0hu2 != null) {
            if (c0hu2.A00 == 5) {
                C13500lM[] c13500lMArr = (C13500lM[]) c0hu2.A07(this.A09);
                if (c13500lMArr != null && c13500lMArr.length == 2) {
                    A00 = C0HU.A05(new C13500lM[]{c13500lMArr[0]}, this.A09);
                    A002 = C0HU.A05(new C13500lM[]{c13500lMArr[1]}, this.A09);
                } else {
                    StringBuilder A0P2 = C000200d.A0P("Invalid crop size values. cropSize=");
                    A0P2.append(Arrays.toString(c13500lMArr));
                    Log.w("ExifInterface", A0P2.toString());
                    return;
                }
            } else {
                int[] iArr = (int[]) c0hu2.A07(this.A09);
                if (iArr != null && iArr.length == 2) {
                    A00 = C0HU.A00(iArr[0], this.A09);
                    A002 = C0HU.A00(iArr[1], this.A09);
                } else {
                    StringBuilder A0P3 = C000200d.A0P("Invalid crop size values. cropSize=");
                    A0P3.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", A0P3.toString());
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", A00);
            hashMapArr[i].put("ImageLength", A002);
        } else if (c0hu3 != null && c0hu4 != null && c0hu5 != null && c0hu6 != null) {
            int A06 = c0hu3.A06(this.A09);
            int A062 = c0hu5.A06(this.A09);
            int A063 = c0hu6.A06(this.A09);
            int A064 = c0hu4.A06(this.A09);
            if (A062 <= A06 || A063 <= A064) {
                return;
            }
            C0HU A003 = C0HU.A00(A062 - A06, this.A09);
            C0HU A004 = C0HU.A00(A063 - A064, this.A09);
            hashMapArr[i].put("ImageLength", A003);
            hashMapArr[i].put("ImageWidth", A004);
        } else {
            Object obj = hashMapArr[i].get("ImageLength");
            Object obj2 = hashMapArr[i].get("ImageWidth");
            if ((obj != null && obj2 != null) || (c0hu = (C0HU) hashMapArr[i].get("JPEGInterchangeFormat")) == null) {
                return;
            }
            A0C(c13470lJ, c0hu.A06(this.A09), i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0116, code lost:
        r10.A02 = r9.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x011a, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b2 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0C(X.C13470lJ r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HT.A0C(X.0lJ, int, int):void");
    }

    public final void A0D(C13470lJ c13470lJ, HashMap hashMap) {
        int i;
        C0HU c0hu = (C0HU) hashMap.get("JPEGInterchangeFormat");
        C0HU c0hu2 = (C0HU) hashMap.get("JPEGInterchangeFormatLength");
        if (c0hu == null || c0hu2 == null) {
            return;
        }
        int A06 = c0hu.A06(this.A09);
        int min = Math.min(c0hu2.A06(this.A09), c13470lJ.available() - A06);
        int i2 = this.A01;
        if (i2 != 4 && i2 != 9 && i2 != 10) {
            if (i2 == 7) {
                i = this.A02;
            }
            if (A06 > 0 || min <= 0) {
            }
            this.A0B = true;
            this.A08 = A06;
            this.A07 = min;
            if (this.A0E == null) {
                byte[] bArr = new byte[min];
                c13470lJ.A00(A06);
                c13470lJ.readFully(bArr);
                this.A0D = bArr;
                return;
            }
            return;
        }
        i = this.A00;
        A06 += i;
        if (A06 > 0) {
        }
    }

    public void A0E(String str) {
        C13490lL c13490lL;
        C0HU c0hu;
        int intValue;
        String obj;
        String str2 = str;
        String str3 = "ISOSpeedRatings".equals("Orientation") ? "PhotographicSensitivity" : "Orientation";
        int i = 2;
        int i2 = 1;
        if (str != null && A0M.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = A0N.matcher(str2);
                if (!matcher.find()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid value for ");
                    sb.append(str3);
                    sb.append(" : ");
                    sb.append(str2);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Integer.parseInt(matcher.group(1)));
                sb2.append("/1,");
                sb2.append(Integer.parseInt(matcher.group(2)));
                sb2.append("/1,");
                sb2.append(Integer.parseInt(matcher.group(3)));
                sb2.append("/1");
                str2 = sb2.toString();
            } else {
                try {
                    str2 = new C13500lM((long) (Double.parseDouble(str2) * 10000.0d), 10000L).toString();
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid value for ");
                    sb3.append(str3);
                    sb3.append(" : ");
                    sb3.append(str2);
                    Log.w("ExifInterface", sb3.toString());
                    return;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        while (i4 < A0j.length) {
            if ((i4 != 4 || this.A0B) && (c13490lL = (C13490lL) A0i[i4].get(str3)) != null) {
                if (str2 == null) {
                    this.A0F[i4].remove(str3);
                } else {
                    Pair A00 = A00(str2);
                    int i5 = c13490lL.A01;
                    int intValue2 = ((Number) A00.first).intValue();
                    if (i5 != intValue2 && i5 != (intValue = ((Number) A00.second).intValue()) && ((i5 = c13490lL.A02) == -1 || (i5 != intValue2 && i5 != intValue))) {
                        i5 = i5;
                        if (i5 != i2 && i5 != 7 && i5 != i) {
                            StringBuilder sb4 = new StringBuilder("Given tag (");
                            sb4.append(str3);
                            sb4.append(") value didn't match with one of expected ");
                            sb4.append("formats: ");
                            String[] strArr = A0g;
                            sb4.append(strArr[i5]);
                            String str4 = "";
                            if (i5 == -1) {
                                obj = "";
                            } else {
                                StringBuilder A0P2 = C000200d.A0P(", ");
                                A0P2.append(strArr[i5]);
                                obj = A0P2.toString();
                            }
                            sb4.append(obj);
                            sb4.append(" (guess: ");
                            sb4.append(strArr[intValue2]);
                            if (intValue != -1) {
                                StringBuilder A0P3 = C000200d.A0P(", ");
                                A0P3.append(strArr[intValue]);
                                str4 = A0P3.toString();
                            }
                            sb4.append(str4);
                            sb4.append(")");
                            Log.w("ExifInterface", sb4.toString());
                        }
                    }
                    switch (i5) {
                        case 1:
                            HashMap hashMap = this.A0F[i4];
                            if (str2.length() == i2 && str2.charAt(i3) >= '0' && str2.charAt(i3) <= '1') {
                                byte[] bArr = new byte[i2];
                                bArr[0] = (byte) (str2.charAt(0) - '0');
                                c0hu = new C0HU(i2, i2, bArr);
                            } else {
                                byte[] bytes = str2.getBytes(A0K);
                                c0hu = new C0HU(i2, bytes.length, bytes);
                            }
                            hashMap.put(str3, c0hu);
                            continue;
                        case 2:
                        case 7:
                            this.A0F[i4].put(str3, C0HU.A02(str2));
                            continue;
                        case 3:
                            String[] split = str2.split(",", -1);
                            int length = split.length;
                            int[] iArr = new int[length];
                            while (i3 < length) {
                                iArr[i3] = Integer.parseInt(split[i3]);
                                i3++;
                            }
                            this.A0F[i4].put(str3, C0HU.A03(iArr, this.A09));
                            continue;
                        case 4:
                            String[] split2 = str2.split(",", -1);
                            int length2 = split2.length;
                            long[] jArr = new long[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                jArr[i6] = Long.parseLong(split2[i6]);
                            }
                            this.A0F[i4].put(str3, C0HU.A04(jArr, this.A09));
                            continue;
                        case 5:
                            String[] split3 = str2.split(",", -1);
                            int length3 = split3.length;
                            C13500lM[] c13500lMArr = new C13500lM[length3];
                            for (int i7 = 0; i7 < length3; i7++) {
                                String[] split4 = split3[i7].split("/", -1);
                                c13500lMArr[i7] = new C13500lM((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            this.A0F[i4].put(str3, C0HU.A05(c13500lMArr, this.A09));
                            continue;
                        case 6:
                        case 8:
                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                        default:
                            C000200d.A0s("Data format isn't one of expected formats: ", i5, "ExifInterface");
                            continue;
                        case 9:
                            String[] split5 = str2.split(",", -1);
                            int length4 = split5.length;
                            int[] iArr2 = new int[length4];
                            while (i3 < length4) {
                                iArr2[i3] = Integer.parseInt(split5[i3]);
                                i3++;
                            }
                            HashMap hashMap2 = this.A0F[i4];
                            ByteOrder byteOrder = this.A09;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[A0V[9] * length4]);
                            wrap.order(byteOrder);
                            for (int i8 = 0; i8 < length4; i8++) {
                                wrap.putInt(iArr2[i8]);
                            }
                            hashMap2.put(str3, new C0HU(9, length4, wrap.array()));
                            continue;
                        case 10:
                            String[] split6 = str2.split(",", -1);
                            int length5 = split6.length;
                            C13500lM[] c13500lMArr2 = new C13500lM[length5];
                            int i9 = 0;
                            while (i9 < length5) {
                                String[] split7 = split6[i9].split("/", -1);
                                c13500lMArr2[i9] = new C13500lM((long) Double.parseDouble(split7[i3]), (long) Double.parseDouble(split7[i2]));
                                i9++;
                                i2 = 1;
                                i3 = 0;
                            }
                            HashMap hashMap3 = this.A0F[i4];
                            ByteOrder byteOrder2 = this.A09;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[A0V[10] * length5]);
                            wrap2.order(byteOrder2);
                            for (int i10 = 0; i10 < length5; i10++) {
                                C13500lM c13500lM = c13500lMArr2[i10];
                                wrap2.putInt((int) c13500lM.A01);
                                wrap2.putInt((int) c13500lM.A00);
                            }
                            hashMap3.put(str3, new C0HU(10, length5, wrap2.array()));
                            continue;
                        case 12:
                            String[] split8 = str2.split(",", -1);
                            int length6 = split8.length;
                            double[] dArr = new double[length6];
                            for (int i11 = 0; i11 < length6; i11++) {
                                dArr[i11] = Double.parseDouble(split8[i11]);
                            }
                            HashMap hashMap4 = this.A0F[i4];
                            ByteOrder byteOrder3 = this.A09;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[A0V[12] * length6]);
                            wrap3.order(byteOrder3);
                            for (int i12 = 0; i12 < length6; i12++) {
                                wrap3.putDouble(dArr[i12]);
                            }
                            hashMap4.put(str3, new C0HU(12, length6, wrap3.array()));
                            continue;
                    }
                }
            }
            i4++;
            i = 2;
            i3 = 0;
            i2 = 1;
        }
    }

    public final void A0F(String str) {
        for (int i = 0; i < A0j.length; i++) {
            this.A0F[i].remove(str);
        }
    }

    public final boolean A0G(HashMap hashMap) {
        C0HU c0hu = (C0HU) hashMap.get("ImageLength");
        C0HU c0hu2 = (C0HU) hashMap.get("ImageWidth");
        if (c0hu == null || c0hu2 == null) {
            return false;
        }
        return c0hu.A06(this.A09) <= 512 && c0hu2.A06(this.A09) <= 512;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005e: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:81:0x005e */
    public byte[] A0H() {
        Closeable closeable;
        FileInputStream fileInputStream;
        Closeable closeable2 = null;
        if (!this.A0B) {
            return null;
        }
        byte[] bArr = this.A0D;
        try {
            if (bArr != null) {
                return bArr;
            }
            try {
                String str = this.A0E;
                fileInputStream = str != null ? new FileInputStream(str) : null;
            } catch (IOException e) {
                e = e;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                A02(closeable2);
                throw th;
            }
            try {
                if (fileInputStream != null) {
                    if (fileInputStream.skip(this.A08) == this.A08) {
                        byte[] bArr2 = new byte[this.A07];
                        if (fileInputStream.read(bArr2) == this.A07) {
                            this.A0D = bArr2;
                            A02(fileInputStream);
                            return bArr2;
                        }
                        throw new IOException("Corrupted image");
                    }
                    throw new IOException("Corrupted image");
                }
                throw new FileNotFoundException();
            } catch (IOException e2) {
                e = e2;
                Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                A02(fileInputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }
}
