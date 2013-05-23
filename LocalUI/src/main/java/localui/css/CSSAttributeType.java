package localui.css;

public enum CSSAttributeType {
	// scroll | fixed | inherit
	BACKGROUND_ATTACHMENT,
	
	// <color> | inherit
	BACKGROUND_COLOR,
	
	// <url> | none | inherit
	BACKGROUND_IMAGE,
	
	// [ [ <percentage> | <length> | left | center | right ] 
	// 		[ <percentage> | <length> | top | center | bottom ]? ] 
	// | [ [ left | center | right ] || [ top | center | bottom ] ] 
	// | inherit
	BACKGROUND_POSITION,
	
	// repeat | repeat-x | repeat-y | no-repeat | inherit
	BACKGROUND_REPEAT,
	
	// [¡®background-color¡¯ || ¡®background-image¡¯ 
	// || ¡®background-repeat¡¯ || ¡®background-attachment¡¯ 
	// || background-position] | inherit
	BACKGROUND,
	
	// collapse | separate | inherit
	BORDER_COLLAPSE,
	
	// [<color>]{1,4} | inherit
	BORDER_COLOR,
	
	// <length> <length>? | inherit
	BORDER_SPACING,
	
	// <border-style>{1.4} | inherit
	BORDER_STYLE,
	
	// [<border-width> || <border-style> || border--color] | inherit
	BORDER_TOP,
	BORDER_RIGHT,
	BORDER_BOTTOM,
	BORDER_LEFT,
	
	// <color> | inherit
	BORDER_TOP_COLOR,
	BORDER_RIGHT_COLOR,
	BORDER_BOTTOM_COLOR,
	BORDER_LEFT_COLOR,
	
	// <border-style> | inherit
	BORDER_TOP_STYLE,
	BORDER_RIGHT_STYLE,
	BORDER_BOTTOM_STYLE,
	BORDER_LEFT_STYLE,
	
	// <border-width> | inherit
	BORDER_TOP_WIDTH,
	BORDER_RIGHT_WIDTH,
	BORDER_BOTTOM_WIDTH,
	BORDER_LEFT_WIDTH,
	
	// <border-width>{1,4} | inherit
	BORDER_WIDTH,
	
	// [ <border-width> || <border-style> 
	// || border-top-color ] | inherit
	BORDER,
	
	// <length> | <percentage> | auto | inherit
	BOTTOM,
	
	// top | bottom | inherit
	CAPTION_SIDE,
	
	// none | left | right | both | inherit
	CLEAR,
	
	// <shape> | auto | inherit
	CLIP,
	
	// <color> | inherit
	COLOR,
	
	// normal | none | [ <string> | <uri> | <counter> 
	// | attr(<identifier>) | open-quote | close-quote 
	// | no-open-quote | no-close-quote ]+ | inherit
	CONTENT,
	
	// [ <identifier> <integer>? ]+ | none | inherit
	COUNTER_INCREMENT,
	
	//[ <identifier> <integer>? ]+ | none | inherit
	COUNTER_RESET,
	
	// [ [<uri> ,]* [ auto | crosshair | default | pointer 
	// | move | e-resize | ne-resize | nw-resize | n-resize 
	// | se-resize | sw-resize | s-resize | w-resize | text 
	// | wait | help | progress ] ] | inherit
	CURSOR,
	
	// ltr | rtl | inherit
	DIRECTION,
	
	// inline | block | list-item | inline-block | table 
	// | inline-table | table-row-group | table-header-group 
	// | table-footer-group | table-row | table-column-group 
	// | table-column | table-cell | table-caption | none 
	// | inherit
	DISPLAY,
	
	//show | hide | inherit
	EMPTY_CELLS,
	
	// left | right | none | inherit
	FLOAT,
	
	// [ [ <family-name> | <generic-family> ] 
	// [, <family-name>| <generic-family> ]* ] | inherit 	
	FONT_FAMILY,
	
	// <absolute-size> | <relative-size> | <length> 
	// | <percentage> | inherit
	FONT_SIZE,
	
	// normal | italic | oblique | inherit
	FONT_STYLE,
	
	// normal | small-caps | inherit
	FONT_VARIANT,
	
	// normal | bold | bolder | lighter | 100 | 200 | 300 
	// | 400 | 500 | 600 | 700 | 800 | 900 | inherit
	FONT_WEIGHT,
	
	// [ [ ¡®font-style¡¯ || ¡®font-variant¡¯ || ¡®font-weight¡¯ ]? 
	//      ¡®font-size¡¯ [ / ¡®line-height¡¯ ]? font-family ] 
	// | caption | icon | menu | message-box | small-caption 
	// | status-bar | inherit
	FONT,
	
	// <length> | <percentage> | auto | inherit
	HEIGHT,
	
	// <length> | <percentage> | auto | inherit
	LEFT,
	
	// normal | <length> | inherit
	LETTER_SPACING,
	
	// normal | <number> | <length> | <percentage> | inherit
	LINE_HEIGHT,
	
	// <uri> | none | inherit
	LIST_STYLE_IMAGE,
	
	// inside | outside | inherit
	LIST_STYLE_POSITION,
	
	// disc | circle | square | decimal | decimal-leading-zero 
	// | lower-roman | upper-roman | lower-greek | lower-latin 
	// | upper-latin | armenian | georgian | lower-alpha 
	// | upper-alpha | none | inherit
	LIST_STYLE_TYPE,
	
	// [ ¡®list-style-type¡¯ || ¡®list-style-position¡¯ 
	// || list-style-image ] | inherit
	LIST_STYLE,
	
	// <margin-width> | inherit
	MARGIN_RIGHT,
	MARGIN_LEFT,
	MARGIN_TOP,
	MARGIN_BOTTOM,
	
	// <margin-width>{1,4} | inherit
	MARGIN,
	
	// <length> | <percentage> | none | inherit
	MAX_HEIGHT,
	MAX_WIDTH,
	
	// <length> | <percentage> | inherit
	MIN_HEIGHT,
	MIN_WIDTH,
	
	// <number> | inherit
	OPACITY,
	
	// <integer> | inherit
	ORPHANS,
	
	// <color> | invert | inherit
	OUTLINE_COLOR,
	
	// <border-style> | inherit
	OUTLINE_STYLE,
	
	// <border-width> | inherit
	OUTLINE_WIDTH,
	
	// [ ¡®outline-color¡¯ || ¡®outline-style¡¯ || outline-width ] 
	// | inherit
	OUTLINE,
	
	// visible | hidden | scroll | auto | inherit
	OVERFLOW,
	
	// <padding-width> | inherit
	PADDING_TOP,
	PADDING_RIGHT,
	PADDING_BOTTOM,
	PADDING_LEFT,
	
	// <padding-width>{1,4} | inherit
	PADDING,
	
	// auto | always | avoid | left | right | inherit
	PAGE_BREAK_AFTER,
	PAGE_BREAK_BEFORE,
	
	// avoid | auto | inherit
	PAGE_BREAK_INSIDE,
	
	// static | relative | absolute | fixed | inherit 	
	POSITION,
	
	// [<string> <string>]+ | none | inherit
	QUOTOS,
	
	// <length> | <percentage> | auto | inherit
	RIGHT,
	
	// auto | fixed | inherit
	TABLE_LAYOUT,
	
	// left | right | center | justify | inherit
	TEXT_ALIGN,
	
	// none | [ underline || overline || line-through 
	// || blink ] | inherit
	TEXT_DECORATION,
	
	// <length> | <percentage> | inherit
	TEXT_INDENT,
	
	// capitalize | uppercase | lowercase | none | inherit
	TEXT_TRANSFORM,
	
	// <length> | <percentage> | auto | inherit
	TOP,
	
	// normal | embed | bidi-override | inherit
	UNICODE_BIDI,
	
	// baseline | sub | super | top | text-top | middle 
	// | bottom | text-bottom | <percentage> | <length> 
	// | inherit 	
	VERTICAL_ALIGN,
	
	// visible | hidden | collapse | inherit
	VISIBILITY,
	
	// normal | pre | nowrap | pre-wrap | pre-line | inherit
	WHITE_SPACE,
	
	// <integer> | inherit
	WINDOWS,
	
	// <length> | <percentage> | auto | inherit
	WIDTH,
	
	// normal | <length> | inherit
	WORD_SPACING,
	
	// auto | <integer> | inherit
	Z_INDEX
}
