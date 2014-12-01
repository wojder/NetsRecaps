//package com.example.NetsRecaps;
//
//import android.app.Activity;
//
///**
// * Created by wojder on 01.12.14.
// */
//public class NetworkActivity extends Activity {
////
////    public static final String WIFI = "Wi-fi";
////    public static final String ANY = "Any";
////    public static final String URL = "https://shielded-retreat-4872.herokuapp.com/atom.xml";
////    private static final String TAG = "NetworkActivity";
////
////    private static boolean wifiConnected = false;
////    private static boolean mobileConnected = false;
////    public static boolean refreshDisplay = true;
////    public static String sPref = null;
////
////
////    public void loadPage() {
////
////        if ((sPref.equals(ANY)) && (wifiConnected || mobileConnected)) {
////            new DownloadXmlTask().execute(URL);
////        } else if ((sPref.equals(WIFI)) && (wifiConnected)) {
////            new DownloadXmlTask().execute(URL);
////        } else {
////            Log.i(TAG, "Some kind of networking problems occured");
////        }
////
////    }
////    private class DownloadXmlTask extends AsyncTask<String, Void, String> {
////        @Override
////        protected String doInBackground(String... params) {
////            try {
////                return loadXmlFromNetwork(params[0]);
////            } catch (IOException e) {
////                return getResources().getString(R.string.connection_error);
////            } catch (XmlPullParserException e) {
////                return getResources().getString(R.string.xml_error);
////            }
////        }
////
////        @Override
////        protected void onPostExecute(String result) {
////            setContentView(R.layout.main);
////            WebView recapWebVew = (WebView) findViewById(R.id.recapsWebView);
////            recapWebVew.loadData(result, "text/html", null);
////        }
////
////        private String loadXmlFromNetwork(String urlString) throws XmlPullParserException, IOException{
////
////            InputStream stream = null;
////            RecapsXmlParser recapsXmlParser = new RecapsXmlParser();
////            List entries = null;
////            String title = null;
////            String update = null;
////            String content = null;
////            Calendar rightNow = Calendar.getInstance();
////            DateFormat dateFormat = new SimpleDateFormat("MMM dd h:mmaa");
////
////            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
////            boolean pref = sharedPreferences.getBoolean("summaryPref", false);
////
////            StringBuilder htmlString = new StringBuilder();
////            htmlString.append("<h3>" + getResources().getString(R.string.page_title) + "</h3>");
////            htmlString.append("<em>" + getResources().getString(R.string.updated) + " " +
////                    dateFormat.format(rightNow.getTime()) + "</em>");
////            try {
////
////                stream = downloadUrl(urlString);
////                entries = RecapsXmlParser.parse(stream);
////
////            } finally {
////                if (stream != null) {
////
////                    stream.close();
////                }
////            }
////
////            return null;
////
////
////        }
////
////
////    }
////    private InputStream downloadUrl(String urlString) throws IOException{
////
////        java.net.URL url = new URL(urlString);
////        return null;
////    }
////    private String loadXmlFromNetwork(String urlString) throws XmlPullParserException, IOException{
////
////        InputStream stream = null;
////        RecapsXmlParser recapsXmlParser = new RecapsXmlParser();
////        List entries = null;
////        String title = null;
////        String update = null;
////        String content = null;
////        Calendar rightNow = Calendar.getInstance();
////        DateFormat dateFormat = new SimpleDateFormat("MMM dd h:mmaa");
////
////        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
////        boolean pref = sharedPreferences.getBoolean("summaryPref", false);
////
////        StringBuilder htmlString = new StringBuilder();
////        htmlString.append("<h3>" + getResources().getString(R.string.page_title) + "</h3>");
////        htmlString.append("<em>" + getResources().getString(R.string.updated) + " " +
////                dateFormat.format(rightNow.getTime()) + "</em>");
////        try {
////
////            stream = downloadUrl(urlString);
////            entries = RecapsXmlParser.parse(stream);
////
////        } finally {
////            if (stream != null) {
////
////                stream.close();
////            }
////        }
////
////        return null;
////
////
////    }
////
//
//}
