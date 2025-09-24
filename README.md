# capacitor-pip

Capacitor plugin for picture in picture feature

## Install

```bash
npm install capacitor-pip
npx cap sync
```

## API

<docgen-index>

* [`isPiPAvailable()`](#ispipavailable)
* [`isPipEnable()`](#ispipenable)
* [`startPiPMode(...)`](#startpipmode)
* [`openSettings()`](#opensettings)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### isPiPAvailable()

```typescript
isPiPAvailable() => Promise<{ available: boolean; }>
```

**Returns:** <code>Promise&lt;{ available: boolean; }&gt;</code>

--------------------


### isPipEnable()

```typescript
isPipEnable() => Promise<{ enable: boolean; }>
```

**Returns:** <code>Promise&lt;{ enable: boolean; }&gt;</code>

--------------------


### startPiPMode(...)

```typescript
startPiPMode(options?: { aspectRatio?: IRatio | undefined; } | undefined) => Promise<{ success: boolean; }>
```

| Param         | Type                                                         |
| ------------- | ------------------------------------------------------------ |
| **`options`** | <code>{ aspectRatio?: <a href="#iratio">IRatio</a>; }</code> |

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### openSettings()

```typescript
openSettings() => Promise<void>
```

--------------------


### Interfaces


#### IRatio

| Prop         | Type                |
| ------------ | ------------------- |
| **`height`** | <code>number</code> |
| **`width`**  | <code>number</code> |

</docgen-api>
