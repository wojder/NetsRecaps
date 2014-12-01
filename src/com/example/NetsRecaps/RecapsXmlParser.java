//package com.example.NetsRecaps;
//
///**
// * Created by wojder on 01.12.14.
// */
//public class RecapsXmlParser {
////
////    private static final String ns = null;
////
////    public List<Entry> parse(InputStream in) throws XmlPullParserException, IOException {
////
////        try {
////            XmlPullParser parser = Xml.newPullParser();
////            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
////            parser.setInput(in, null);
////            parser.nextTag();
////            return readFeed(parser);
////        } finally {
////            in.close();
////        }
////    }
////
////    public static class Entry {
////
////        private final String update;
////        private final String content;
////        private final String title;
////
////
////        private Entry(String title, String update, String content) {
////            this.title = title;
////            this.update = update;
////            this.content = content;
////        }
////    }
////
////    private Entry readEntry(XmlPullParser parser) throws XmlPullParserException, IOException {
////
////        parser.require(XmlPullParser.START_TAG, ns, "entry");
////        String title = null;
////        String content = null;
////        String update = null;
////        while (parser.next() != XmlPullParser.END_TAG) {
////
////            if (parser.getEventType() != XmlPullParser.START_TAG) {
////                continue;
////            }
////
////            String name = parser.getName();
////            if (name.equals("title")) {
////                title = readTitle(parser);
////            } else if (name.equals(content)) {
////                content = readContent(parser);
////            } else if (name.equals(update)) {
////                update = readUpdate(parser);
////            } else {
////                skip(parser);
////            }
////        }
////
////        return new Entry(title, update, content);
////
////    }
////
////    private String readContent(XmlPullParser parser) throws XmlPullParserException, IOException {
////        parser.require(XmlPullParser.START_TAG, ns, "content");
////        String content = readText(parser);
////        parser.require(XmlPullParser.END_TAG, ns, "content");
////        return content;
////    }
////
////    private String readUpdate(XmlPullParser parser) throws XmlPullParserException, IOException {
////        parser.require(XmlPullParser.START_TAG, ns, "update");
////        String update = readText(parser);
////        parser.require(XmlPullParser.END_TAG, ns, "update");
////        return update;
////    }
////
////        private String readTitle(XmlPullParser parser) throws XmlPullParserException, IOException{
////        parser.require(XmlPullParser.START_TAG, ns, "title");
////        String title = readText(parser);
////        parser.require(XmlPullParser.END_TAG, ns, "title");
////        return title;
////    }
////
////
////    private List<Entry> readFeed(XmlPullParser parser) throws XmlPullParserException, IOException {
////
////        List<Entry> entries = new ArrayList<Entry>();
////
////        parser.require(XmlPullParser.START_TAG, ns, "feed");
////        while (parser.next() != XmlPullParser.START_TAG) {
////            continue;
////        }
////
////        String name = parser.getName();
////
////        if (name.equals("entry")) {
////            entries.add(readEntry(parser));
////        } else {
////            skip(parser);
////        }
////        return entries;
////    }
////
////    private String readText(XmlPullParser parser) throws XmlPullParserException, IOException {
////        String result = "";
////        if (parser.next() == XmlPullParser.TEXT) {
////            result = parser.getText();
////            parser.nextTag();
////        }
////        return result;
////    }
////
////    private void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
////
////        if (parser.getEventType() != XmlPullParser.START_TAG) {
////            throw new IllegalStateException();
////        }
////        int depth = 1;
////        while (depth != 0) {
////
////            switch (parser.next()) {
////
////                case XmlPullParser.END_TAG:
////                    depth --;
////                    break;
////                case XmlPullParser.START_TAG:
////                    depth ++;
////                    break;
////            }
////        }
////    }
//}
