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
* [`startPiPMode(...)`](#startpipmode)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### isPiPAvailable()

```typescript
isPiPAvailable() => Promise<IStatus>
```

**Returns:** <code>Promise&lt;<a href="#istatus">IStatus</a>&gt;</code>

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


### Interfaces


#### IStatus

| Prop            | Type                 |
| --------------- | -------------------- |
| **`available`** | <code>boolean</code> |


#### IRatio

| Prop         | Type                |
| ------------ | ------------------- |
| **`height`** | <code>number</code> |
| **`width`**  | <code>number</code> |

</docgen-api>
